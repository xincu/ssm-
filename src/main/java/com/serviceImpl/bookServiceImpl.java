package com.serviceImpl;

import org.springframework.stereotype.Service;

@Service("bookservice")
public class bookServiceImpl {

    public  void addbook(){
        System.out.println("业务层");
    }
}
