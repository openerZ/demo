package com.example.demo.sercvice.impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.jdbcDao;
import com.example.demo.sercvice.CrudUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserserviceimplJdbc implements CrudUserService {


    @Autowired
    private jdbcDao jd;


    @Override
    public List<User> queryUserList() throws Exception {

        return jd.queryUserList();

    }

    @Override
    public void addUser(User user) throws Exception {
       jd.addUser(user);

    }

    @Override
    public void delUser(Long id) throws Exception {
        jd.delUser(id);
    }

    @Override
    public void updateUser(User user) throws Exception {
        jd.updateUser(user);
    }

    @Override
    public User findOne(Long id) throws Exception {
        return jd.findOne(id);
    }

    @Override
    public List<User> findUsers(String username) throws Exception {
        return jd.findUsers(username);
    }
}
