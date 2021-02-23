package com.lzl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zonglin Liang on 2021/2/22.
 * Describe:
 **/
@RestController
@RequestMapping("/native")
public class ConfigClientController {

    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index(){
        return this.port+"-"+this.foo;
    }
}
