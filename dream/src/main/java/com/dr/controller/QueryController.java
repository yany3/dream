package com.dr.controller;

import com.dr.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-10-17 15:36
 */
@RestController
@Slf4j
public class QueryController {
    @Autowired
    DemoService demoService;
    private static Logger logger = LoggerFactory.getLogger(QueryController.class);

    @RequestMapping(value = "/test")
    public void testHttp(){

    }
}
