package com.revolver.mapper.FrontEnd;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmailMapper {

    List<Map<String, String>> selectProductDetail(Map<String,Object> map);
    //订单中商品状态更改，邮件通知
    Map<String, String> selectProductDetailByOrder(Map<String, Object> map);
}
