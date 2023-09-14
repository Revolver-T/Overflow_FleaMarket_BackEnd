package com.revolver.mapper.BackEnd;


import com.revolver.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface BackProductMapper {
    //查询全部商品列表
    List<Map<String,Object>> selectProductList(Product pro);
    //查询商品评论列表
    List<Map<String, Object>> selectProductCommentList(Product pro);
}
