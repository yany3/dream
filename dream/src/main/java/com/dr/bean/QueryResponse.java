package com.dr.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-11-12 10:43
 */
@Getter
@Setter
public class QueryResponse {
    /**
     * 响应信息
     */
    private String responseMsg;
    /**
     * 响应编码
     */
    private String responseCode;
    /**
     *
     */
    private UserInfo userInfo;
}
