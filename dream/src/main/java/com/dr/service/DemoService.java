package com.dr.service;

import lombok.extern.slf4j.Slf4j;
import org.n3r.eql.Eql;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-11-05 15:08
 */
@Service
@Slf4j
public class DemoService {

    private static Logger logger = LoggerFactory.getLogger(DemoService.class);

    public String getUserName(Map param){
        return new Eql().selectFirst("test").params(param).returnType(String.class).execute();
    }
    public String getDbTest(){
        return new Eql().selectFirst("test").returnType(String.class).execute();
    }

    public String eqlTest(Map param){
        return new Eql().selectFirst("test").params(param).returnType(String.class).execute();
    }

}
