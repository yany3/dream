package com.dr.controller;

import com.dr.bean.QueryResponse;
import com.dr.bean.UserInfo;
import com.dr.service.DemoService;
import com.dr.utils.checkUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-10-17 15:00
 */
@RestController
@Slf4j
public class HelloController {
    @Autowired
    DemoService demoService;
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping(value = "/hello")
    public String sayHello(){
        logger.error("hello world");
        return "hello world";
    }

    @RequestMapping(value = "/calculate/mod")
    public String mod(Integer numberToBeModed,Integer number){
        String result;
        if (numberToBeModed==0||number==0){
            return "params should not be 0";
        }else {
            result =String.valueOf(numberToBeModed%number) ;
        }
        return result;
    }
    @RequestMapping(value = "/calculate")
    public String cal(Integer speed,Integer size){
        String result;
        result = String.valueOf(size*1024/speed/60);
        return "calculate result "+result+"min";
    }

    @RequestMapping(value = "/testDB")
    public QueryResponse testDB(UserInfo userInfo) throws Exception{
        //实例化返回值bean
       QueryResponse queryResponse= checkUtils.checkRequestParam(userInfo);
        try {
            Map param = BeanUtils.describe(userInfo);
            String userName = demoService.getUserName(param);
            userInfo.setUserName(userName);
            queryResponse.setUserInfo(userInfo);
            return queryResponse;
        }catch (Exception e){
            queryResponse.setResponseCode("9999");
            queryResponse.setResponseMsg("查询失败");
            logger.error("查询失败,{}",e);
            return queryResponse;
        }
    }

}
