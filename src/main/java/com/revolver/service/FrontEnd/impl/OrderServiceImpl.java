package com.revolver.service.FrontEnd.impl;

import com.revolver.mapper.FrontEnd.OrderMapper;
import com.revolver.pojo.Order;
import com.revolver.service.FrontEnd.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper mapper;
    @Override
    @Transactional
    public Map<String, Object> insertOrderByOrder(Order order) {
        Map<String,Object> map = new HashMap<String,Object>();
        List<Map<String,Object>> list = new ArrayList<>();

        //生成UUID作为订单编号
        String uuid = UUID.randomUUID().toString().toUpperCase();
        order.setOrderId(uuid);
        System.out.println(order.getOrderId());
        for (Object item : order.getProductId()) {
            Map<String,Object> map2 = new HashMap<String,Object>();
            map2.put("order_id",uuid);
            map2.put("product_id",item);
            list.add(map2);
        }
        //创建订单
        int resulto =  mapper.insertOrderByOrder(order);
        //插入订单商品列表
        int resultp = mapper.insertOrderProduct(list);
        map.put("resulto",resulto);
        map.put("resultp",resultp);
        map.put("uuid",uuid);
        return map;
    }

    @Override
    public Order selectOrderById(String oid) {
        return mapper.selectOrderById(oid);
    }

    @Override
    public int updateOrderByOid(Order order) {
        return mapper.updateOrderByOid(order);
    }

    @Override
    public int deleteOrderByOid(Order order) {
        int count =  mapper.deleteOrderProductByOid(order);
        return mapper.deleteOrderByOid(order);
    }

    @Override
    public List<Order> selectOrderByUserId(Integer userid) {
        return mapper.selectOrderByUserId(userid);
    }

    @Override
    public List<Order> selectOrderByList(Order order) {
        return mapper.selectOrderByList(order);
    }

    @Override
    public List<Map<String, Object>> selectOrderProductByUserId(Integer userid) {
        return mapper.selectOrderProductByUserId(userid);
    }

    @Override
    public int updateOrderById(Map<String, Object> map) {
        return mapper.updateOrderById(map);
    }
}
