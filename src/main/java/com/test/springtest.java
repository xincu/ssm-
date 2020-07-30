package com.test;

import com.mapper.base_dictMapper;
import com.serviceImpl.bookServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;
import java.io.InputStream;

public class springtest {
    @Test
    public void run1(){
        /*创建applicationcontext对象*/
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
/*创建业务层类对象*/
        bookServiceImpl book1= (bookServiceImpl) applicationContext.getBean("bookservice");
      /*  bookServiceImpl book2= (bookServiceImpl) applicationContext.getBean("com.serviceImpl.bookServiceImpl");*/
        System.out.println("第一个开始");
        book1.addbook("12");
        /**/
       /* System.out.println("第二个");
        book2.addbook();*/
    }
    @Test
    public  void  run2() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("mybatisConfig.xml");
      /*通过流获取会话工厂建造*/
        SqlSessionFactory sf=new  SqlSessionFactoryBuilder().build(inputStream);
         SqlSession sqlSession = sf.openSession();

        base_dictMapper bd= sqlSession.getMapper(base_dictMapper.class);
     bd.selectByPrimaryKey("12");
     sqlSession.close();
     inputStream.close();
    }

}
