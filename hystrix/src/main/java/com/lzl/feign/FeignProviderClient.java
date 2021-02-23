package com.lzl.feign;

import com.lzl.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * Created by Zonglin Liang on 2021/2/22.
 * Describe:
 **/

@FeignClient(value = "provider")  //value为要访问的微服务名
public interface FeignProviderClient {
    @GetMapping("/student/findAll")  //要访问的微服务的地址
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
