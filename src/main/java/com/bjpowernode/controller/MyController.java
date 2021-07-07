package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;




// 处理请求的
@Controller
public class MyController {
    // 处理用户请求，springMVC是使用方法来处理的
    @RequestMapping(value = "/user/some.do", produces = "text/plain;charset=utf-8")
    @ResponseBody
    public ModelAndView doSome(Student student) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index.jsp");
        return mv;
    }
}
