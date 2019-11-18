package com.dr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.n3r.eql.util.T;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-11-05 15:10
 */
@Mapper
@Repository
public interface DemoMapper extends BaseMapper<T> {

    String test(@Param("param") Map param);

    String queryIfPhotoTagExist(@Param("param") Map param);

    String testDb(@Param("param") String param);

}
