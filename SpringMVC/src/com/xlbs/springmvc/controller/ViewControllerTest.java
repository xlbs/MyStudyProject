package com.xlbs.springmvc.controller;

import com.xlbs.clientservice.daofactory.DAOFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/viewTest")
public class ViewControllerTest {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT * FROM `bs_user`");
        List<Map> list = DAOFactory.getInstance().getQueryInterface().querySqlReturnListMap(sb.toString());
        System.out.print(list.toString());
    }

    @RequestMapping(value = "/ftlTest")
    public ModelAndView ftlView(){
        ModelAndView mav = new ModelAndView();
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT * FROM `bs_user`");
        List<Map> list = DAOFactory.getInstance().getQueryInterface().querySqlReturnListMap(sb.toString());
        System.out.print(list.toString());
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
