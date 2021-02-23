package com.lzl.controller;

import com.lzl.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * Created by Zonglin Liang on 2021/2/20.
 * Describe:
 **/
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        //restTemplate.getForEntity返回的是封装过后的对象，.getBody返回一个集合，url为接口地址，第二个参数是返回值类型
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        //restTemplate.getForEntity返回的是封装过后的对象，.getBody返回一个集合，url为接口地址，第二个参数是返回值类型
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id")long id){
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}",Student.class,id).getBody();
    }
    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable("id")long id){
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/student/save",student,null);
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,null);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/save",student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id")long id){
        restTemplate.delete("http://localhost:8010/student/delete/{id}",id);
    }


}
