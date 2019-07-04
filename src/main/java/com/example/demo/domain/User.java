package com.example.demo.domain;

import javax.validation.constraints.NotBlank;

public class User {

    // 主键
    private Long id;
    // 用户名
    @NotBlank(message = "用户名不能为空")
    private String username;
    // 密码
    @NotBlank(message = "密码不能为空")
    private String password;
    // 姓名
    @NotBlank(message = "名称不能为空")
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
