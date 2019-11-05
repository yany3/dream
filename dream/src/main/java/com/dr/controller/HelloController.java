package com.dr.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-10-17 15:00
 */
@RestController
@Slf4j
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/hello")
    public String sayHello(){
        logger.error("hello world");
        return "hello world+1";
    }
}
