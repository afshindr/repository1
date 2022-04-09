package com.dokanOnline.dokan.controller;

import com.dokanOnline.dokan.entity.OnlyEntityTest;
import com.dokanOnline.dokan.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class TestClass {

    private TestService testService;

    @Autowired
    public  TestClass(TestService testService){
        this.testService = testService;
    }

//    @GetMapping
//    public String sayHello(){
//        String hi = "hello dear";
//        return hi;
//    }

    @GetMapping
    public List<OnlyEntityTest> sayHelloo(){
    return testService.getAll();
    }

}
