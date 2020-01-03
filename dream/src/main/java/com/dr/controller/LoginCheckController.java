package com.dr.controller;

import com.dr.service.LoginCheckService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yanyu
 * @Date: 2020-01-03 17:41
 */
@RestController
public class LoginCheckController {

    @Autowired
    LoginCheckService service;

    @RequestMapping(value = "/login")
    public String check(String username, String password) {
        boolean checkResult = checkStringIsNull(username, password);
        if (checkResult) {
            String DbPassword = service.queryPasswordByUserName(username);
            if (StringUtils.isEmpty(DbPassword) || !password.equals(DbPassword)) {
                return "9999";
            }
            return "0000";
        }
        return "9999";
    }

    /**
     * 检查字符是否为 null || ""
     * 如果是 null 或者 "" 则返回false ,反则为 true
     *
     * @param value 需要验证的多个字符，以英文逗号分隔
     * @return
     */
    public boolean checkStringIsNull(String... value) {
        int count = 0;
        for (int i = 0; i < value.length; i++) {
            //遍历字符数组所有的参数，发现某个为 null 或者 "" ,则跳出
            if (StringUtils.isEmpty(value[i])) {
                return false;
            }
            count++;
        }
        if (count == value.length) {
            return true;
        }
        return false;
    }
}
