package com.lzl.controller;

import com.lzl.Dao.StudentDao;
import com.lzl.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Zonglin Liang on 2021/2/20.
 * Describe:
 **/
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentDao.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id")Long id){
        return studentDao.findById(id);
    }

    @PostMapping("/save")
    public void saveOrUpdate(@RequestBody Student student){
        studentDao.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentDao.saveOrUpdate(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentDao.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前的端口:"+port;
    }

}
