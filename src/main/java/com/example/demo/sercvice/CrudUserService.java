package com.example.demo.sercvice;

import com.example.demo.domain.User;

import java.util.List;

public interface CrudUserService {

    List<User> queryUserList() throws Exception;

    void addUser(User user) throws Exception;

    void delUser(Long id) throws Exception;

    void updateUser(User user) throws Exception;

    User findOne(Long id) throws Exception;

    List<User> findUsers(String username) throws Exception;
}
