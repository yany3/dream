package com.dr.utils;

import com.dr.base.responseFactory;
import com.dr.bean.QueryResponse;
import com.dr.bean.UserInfo;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-11-12 10:57
 */
public class CheckUtils {
    /**
     * 检查字符是否为 null || ""
     * 如果是 null 或者 "" 则返回false ,反则为 true
     *
     * @param value 需要验证的多个字符，以英文逗号分隔
     * @return false有空值
     */
    public static boolean checkStringIsNull(String... value) {
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

    public static QueryResponse checkRequestParam (UserInfo userInfo) throws Exception{
        QueryResponse queryResponse= responseFactory.getQryRsp(userInfo);
        boolean isParamNotNull = CheckUtils.checkStringIsNull(userInfo.getPassWord(),userInfo.getUserId(),userInfo.getUserName());
        if (!isParamNotNull) {
            queryResponse.setResponseMsg("参数存在空字段");
            queryResponse.setResponseCode("9998");
            throw new Exception("参数存在空字段,9998");
        }
        return queryResponse;
    }
}
