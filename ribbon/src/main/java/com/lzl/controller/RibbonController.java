package com.lzl.controller;

import com.lzl.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Created by Zonglin Liang on 2021/2/21.
 * Describe:
 **/
@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        //restTemplate.getForEntity返回的是封装过后的对象，.getBody返回一个集合，url为接口地址，第二个参数是返回值类型
        return restTemplate.getForEntity("http://provider/student/findAll", Collection.class).getBody();
    }
    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index", String.class);
    }
}
