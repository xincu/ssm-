package com.serviceImpl;

import com.mapper.base_dictMapper;
import com.model.base_dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookservice")
public class bookServiceImpl {
   @Autowired
   private base_dictMapper base_dictMapper;
    public  void addbook(String bid){
        System.out.println("业务层");
        base_dict bd= base_dictMapper.selectByPrimaryKey(bid);
        System.out.println(bd);
    }
}
