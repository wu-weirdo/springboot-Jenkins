package com.whf.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhaifeng
 * @description
 * @date 2022/1/19 23:51
 */

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "hello";
    }
}
