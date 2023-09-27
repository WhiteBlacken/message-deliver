package com.qxy.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qxy
 * @Date 2023/9/27 12:34
 * @Version 1.0
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    private String test() {
        return "test测试";
    }
}
