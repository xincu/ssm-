package com.test;

import com.serviceImpl.bookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtest {
    @Test
    public void run1(){
        /*创建applicationcontext对象*/
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
/*创建业务层类对象*/
        bookServiceImpl book1= (bookServiceImpl) applicationContext.getBean("bookservice");
      /*  bookServiceImpl book2= (bookServiceImpl) applicationContext.getBean("com.serviceImpl.bookServiceImpl");*/
        System.out.println("第一个开始");
        book1.addbook();
        /**/
       /* System.out.println("第二个");
        book2.addbook();*/
    }

}
