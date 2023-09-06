package com.revolver.mapper.FrontEnd;

import com.revolver.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CartMapper {

    //查找购物车列表
    List<Product> selectCartById(int userid);
    //批量删除用户购物车表中的商品
    int deleteProductByArray(Map<String,Object> map);
    //查询购物车中是否已存在该商品
    int selectCartProductById(Map<String,Object> map);
    //添加商品进购物车
    int insertCartById(Map<String, Object> map);
}
