package com.serviceImpl;

import com.mapper.customerMapper;
import com.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookservice")
public class bookServiceImpl {
@Autowired
private customerMapper customerMapper;

    public  void selectByPrimaryKey(){
        System.out.println("业务层");
        customer customer= customerMapper.selectByPrimaryKey(14l);
        System.out.println(customer);
    }
}
