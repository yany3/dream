package com.dr.base;

import com.dr.bean.QueryResponse;
import com.dr.bean.UserInfo;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-11-12 10:51
 */
public class responseFactory {
    /**
     * 生产请求返回bean
     * @param userInfo
     * @return
     */
    public static QueryResponse getQryRsp(UserInfo userInfo){
        QueryResponse queryResponse = new QueryResponse();
        queryResponse.setUserInfo(userInfo);
        return queryResponse;
    }

}
