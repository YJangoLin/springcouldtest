package com.lzl.Dao.impl;

import com.lzl.Dao.StudentDao;
import com.lzl.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zonglin Liang on 2021/2/20.
 * Describe:
 **/
@Repository
public class StudentDaoImpl implements StudentDao {
    private static Map<Long,Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1l,new Student(1l,"张三",22));
        studentMap.put(2l,new Student(2l,"李四",23));
        studentMap.put(3l,new Student(3l,"王五",21));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);

    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
