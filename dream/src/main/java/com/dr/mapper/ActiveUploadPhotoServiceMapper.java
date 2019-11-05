package com.dr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: yanyu5@asiainfo.com
 * @Date: 2019-10-31 18:21
 */
@Mapper
@Repository
public interface ActiveUploadPhotoServiceMapper extends BaseMapper {

    Map queryUploadTag(@Param("param") Map param);

    Map queryOrder(@Param("param") Map param);

    List<Map> queryPhotoInfos(@Param("param") Map param);

    Map queryPhotoTag(@Param("param") Map param);

    Map queryUploadTime(@Param("param") Map param);

    Map queryImgPath(@Param("param") Map param);

    void updatePhotoTag(@Param("param") Map param);

    String queryIfPhotoTagExist(@Param("param") Map param);

    String queryIfPhotoInfoExist(@Param("param") Map param);

    void insertPhotoTag(@Param("param") Map param);

    void insertLog(@Param("param") Map param);

    void insertOcrLog(@Param("param") Map param);

    void updateOcrTag(@Param("param") Map param);

    void updatePhotoPass(@Param("param") Map param);

    int reUpdatePhotoTag(@Param("param") Map param);

    int reUpdatePhotoInfo(@Param("param") Map param);

    int updateUploadTag(@Param("param") Map param);

    void insertKafukaLog(@Param("param") Map param);

    int reInsertPhotoInfo(@Param("param") Map param);

    int reInsertPhotoTag(@Param("param") Map param);



}
