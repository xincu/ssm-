package com.controller;

import com.serviceImpl.bookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bookController {
@Autowired
    bookServiceImpl bookService=new bookServiceImpl();
    @RequestMapping("addbook")
    public  String selectByPrimaryKey(){
        System.out.println("展现层");
        bookService.selectByPrimaryKey();
        return "add";
    }
}
