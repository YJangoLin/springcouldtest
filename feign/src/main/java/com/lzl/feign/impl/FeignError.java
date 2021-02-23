package com.lzl.feign.impl;

import com.lzl.entity.Student;
import com.lzl.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by Zonglin Liang on 2021/2/22.
 * Describe:
 **/
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "<h1>服务维护中.....</h1>";
    }
}
