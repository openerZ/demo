package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class jdbcDao {

    @Autowired
    private JdbcTemplate jt;

    public List<User> queryUserList() throws Exception{
        String sql = "select * from user";
        return jt.query(sql,new BeanPropertyRowMapper<User>(User.class));
    }

    public void addUser(User user) throws Exception {
        String sql = "insert into user(username,password,name) values(?,?,?)";
        jt.update(sql,user.getUsername(),user.getPassword(),user.getName());
    }


    public void delUser(Long id) throws Exception {
        String sql = "delete from user where id = ? ";
        jt.update(sql,id);
    }

    public void updateUser(User user) throws Exception {
        String sql = "update user set username=?, password=?,name=? where id = ? ";
        jt.update(sql,user.getUsername(),user.getPassword(),user.getName(),user.getId());
    }

    public User findOne(Long id) throws Exception {
        String sql = "select * from user where id = ?";
        List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(User.class),id);
        return list==null? null:list.get(0);
    }

    public List<User> findUsers(String username) throws Exception {
        String sql = "select * from user where username like ?";
        List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(User.class),"%"+username+"%");
        return list;
    }

}
