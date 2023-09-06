package com.revolver.controller.FrontEnd;

import com.revolver.pojo.Order;
import com.revolver.service.FrontEnd.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService Service;


    @RequestMapping(value = "/insertOrderByOrder",method = RequestMethod.POST)
    public Map<String,Object> insertOrderByOrder(@RequestBody Order order){
        return Service.insertOrderByOrder(order);
    }


    @RequestMapping(value = "/selectOrderById",method = RequestMethod.GET)
    public Order selectOrderById(String oid){
        return Service.selectOrderById(oid);
    }


    @RequestMapping(value = "/updateOrderByOid",method = RequestMethod.POST)
    public int updateOrderByOid(@RequestBody Order order){
        return Service.updateOrderByOid(order);
    }


    @RequestMapping(value = "/deleteOrderByOid",method = RequestMethod.POST)
    public int deleteOrderByOid(@RequestBody Order order){
        return Service.deleteOrderByOid(order);
    }


    @RequestMapping(value = "/selectOrderByUserId",method = RequestMethod.GET)
    public List<Order> selectOrderByUserId(Integer userId){
        return Service.selectOrderByUserId(userId);
    }


    @RequestMapping(value = "/selectOrderByList",method = RequestMethod.POST)
    public List<Order> selectOrderByList(@RequestBody Order order){
        return Service.selectOrderByList(order);
    }


    @RequestMapping(value = "/selectOrderProductByUserId",method = RequestMethod.GET)
    public List<Map<String,Object>> selectOrderProductByUserId(Integer userid){
        return Service.selectOrderProductByUserId(userid);
    }


    @RequestMapping(value = "/updateOrderById",method = RequestMethod.POST)
    public int updateOrderById(@RequestBody Map<String,Object> map){
        return Service.updateOrderById(map);
    }
}
