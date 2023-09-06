package com.revolver.mapper.FrontEnd;

import com.revolver.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface OrderMapper {
    //创建订单的方法
    int insertOrderByOrder(Order order);
    //插入订单商品列表
    int insertOrderProduct(List<Map<String,Object>> list);
    //查询订单详情
    Order selectOrderById(String oid);
    //订单支付
    int updateOrderByOid(Order order);
    //取消订单
    int deleteOrderByOid(Order order);
    //查找用户订单列表
    List<Order> selectOrderByUserId(Integer userid);
    //查询订单列表
    List<Order> selectOrderByList(Order order);
    //查询用户订单商品列表
    List<Map<String, Object>> selectOrderProductByUserId(Integer userid);
    //修改订单商品的状态
    int updateOrderById(Map<String,Object> map);

    int deleteOrderProductByOid(Order order);
}
