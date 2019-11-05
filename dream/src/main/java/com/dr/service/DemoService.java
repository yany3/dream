package com.dr.service;

import com.dr.mapper.DemoMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-11-05 15:08
 */
@Service
@Slf4j
public class DemoService {
    @Autowired
    DemoMapper demoMapper;
    private static Logger logger = LoggerFactory.getLogger(DemoService.class);


}
