package com.dr.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-11-12 10:36
 */

@Getter
@Setter
public class UserInfo {
    /**
     * 用户唯一标识
     */
    private String userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
}
