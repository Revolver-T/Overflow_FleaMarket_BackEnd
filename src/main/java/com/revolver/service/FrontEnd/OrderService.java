package com.revolver.service.FrontEnd;

import com.revolver.pojo.Order;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public interface OrderService {
    public Map<String,Object> insertOrderByOrder(Order order);

    public Order selectOrderById(String oid);

    public int updateOrderByOid(Order order);

    public int deleteOrderByOid(Order order);

    public List<Order> selectOrderByUserId(Integer userid);

    public List<Order> selectOrderByList(Order order);

    public List<Map<String, Object>> selectOrderProductByUserId(Integer userid);

    public int updateOrderById(Map<String,Object> map);
}
