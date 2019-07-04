package com.example.demo.controller;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *全局异常处理
 *
 */

//@ControllerAdvice
public class ExceptionController {

    //参数校验注解不通过会抛出异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ModelAndView handIllegaParam(MethodArgumentNotValidException e){
        List<ObjectError> errors = e.getBindingResult().getAllErrors();

        StringBuffer str = new StringBuffer("参数不合法：\n");

        if (errors.size() > 0) {
            for (ObjectError error : errors) {
                str.append(error.getArguments().toString()+"\n");
            }
        }
        String a =str.toString();
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",a);
        mv.setViewName("error");
        return mv;
    }


}
