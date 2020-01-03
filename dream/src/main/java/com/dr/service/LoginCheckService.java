package com.dr.service;

import org.n3r.eql.Eql;
import org.springframework.stereotype.Service;

/**
 * @Author: yanyu
 * @Date: 2020-01-03 17:46
 */
@Service
public class LoginCheckService {
    public String queryPasswordByUserName(String username){
        return new Eql().selectFirst("queryPasswordByUserName").params(username).returnType(String.class).execute();
    }
}
