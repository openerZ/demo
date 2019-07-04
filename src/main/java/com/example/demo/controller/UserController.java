package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.sercvice.impl.UserserviceimplJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserserviceimplJdbc userService;

    @RequestMapping("/index")
    @ResponseBody
    public ModelAndView queryUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<User> users = userService.queryUserList();
        mv.addObject("users",users);
        mv.setViewName("queryUserAll");
        return mv;
    }

    @RequestMapping("/addUser")
    public String addUser(@Validated User user, BindingResult bindingResult, Model model) throws Exception {


        if(bindingResult.hasErrors()){
            StringBuffer str = new StringBuffer();
            str.append("参数不合法: \n ");
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                str.append(fieldError.getDefaultMessage()+"\n");
            }
            model.addAttribute("msg",str.toString());
            return "error";
        }

        userService.addUser(user);

        return "redirect:index";

    }


    @RequestMapping("/delUser.do")
    public String delUser(Long id) throws Exception {
        userService.delUser(id);
        return "redirect:index";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user) throws Exception {
        userService.updateUser(user);
        return "redirect:index";
    }

    @RequestMapping("/findByUsername")
    public ModelAndView findByUsername(String username) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<User> userByUname = userService.findUsers("%"+username+"%");

        mv.addObject("userByUname",userByUname);
        mv.setViewName("userByUname");
        return mv;
    }
}
