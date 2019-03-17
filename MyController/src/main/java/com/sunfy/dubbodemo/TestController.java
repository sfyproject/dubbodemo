package com.sunfy.dubbodemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    // 之前这里应该声明一个service，但是dubbo中service会成为一个web项目，所以此处无法直接依赖，但是此处仍然需要声明对象
    // 解决方式，我们将service的接口声明和实现进行拆分，如何拆分：将service，将service创建为一个 .jar包格式的项目
    // 因为除了此处需要外，在service的实现类中同样需要

    // 引入service项目中的service
    // Resource 和 autoWired 作用相同
    @Resource
    private TestService testService;

    @RequestMapping("/getData")
    public String getData(String name){
        String data = testService.getData(name);
        return data;
    }
}
