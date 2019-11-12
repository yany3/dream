package com.dr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-11-05 15:10
 */
@Mapper
@Repository
public interface DemoMapper {

    String test(@Param("param") Map param);


}
