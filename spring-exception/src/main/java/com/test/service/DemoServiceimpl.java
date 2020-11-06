package com.test.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceimpl implements DemoService{
    @Override
    public void show1() {
        System.out.println("抛出类型转换异常！");
        Object str = "xxx";
        Integer num = (Integer)str;
        
    }
}
