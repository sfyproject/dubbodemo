package com.sunfy.dubbodemo;

import org.springframework.stereotype.Service;

/**
 * TestService实现类
 */
@Service("testServiceImpl")
public class TestServiceImpl implements TestService{

    /*
    实现接口中的方法
     */
    public String getData(String name) {
        return "您传递的数据是：" + name;
    }
}
