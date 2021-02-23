package com.lzl.Dao;

import com.lzl.entity.Student;

import java.util.Collection;

public interface StudentDao {
    public Collection<Student> findAll();
    public Student findById(Long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
