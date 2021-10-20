package com.example.demo.controller;

import com.example.common.OneUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 张博康
 * @Description:
 * @Date: 2021/10/19 12:09
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("/")
@Slf4j
public class TestController {


    @GetMapping("test")
    public String test(){

        return OneUtil.printAsTheFormat("");
    }


}
