package com.xlbs.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/main")
public class TestAction {

    @RequestMapping(value = "/view")
    public ModelAndView testView(HttpServletRequest request){
        String path = request.getParameter("path") + "";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(path);
        return mav;
    }


}
