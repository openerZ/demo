package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.sercvice.impl.UserserviceimplJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用来跳转jsp页面
 */
@Controller
public class Contro {

    @Autowired
    private UserserviceimplJdbc userService;

    @RequestMapping("/addUserView")
    public String addUserView(){
        return "addUser";
    }


    @RequestMapping("/updateUserView")
    public ModelAndView updateUserView(Long id) throws Exception {
        ModelAndView mv = new ModelAndView();
        User one = userService.findOne(id);
        mv.addObject("id",id);
        mv.addObject("one",one);
        mv.setViewName("updateUser");
        return mv;
    }
}
