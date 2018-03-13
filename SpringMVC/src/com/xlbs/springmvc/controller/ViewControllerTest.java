package com.xlbs.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/viewTest")
public class ViewControllerTest {

    @RequestMapping(value = "/ftlTest")
    public ModelAndView ftlView(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index.ftl");
        return mav;
    }

    @RequestMapping(value = "/jspTest")
    public ModelAndView jspView(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index.jsp");
        return mav;
    }

    @RequestMapping(value = "/htmlTest")
    public ModelAndView htmlView(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index.html");
        return mav;
    }

}
