package com.revolver.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    //订单id
    private int id;
    //订单编号
    private String orderId;
    //创建人编号
    private int createPersonId;
    //创建时间
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    //是否支付
    private int payed;
    //支付时间
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime payTime;
    //商品数量
    private int productCount;
    //商品总价
    private int productTotal;
    //收货人
    private String receiver;
    //收货人联系方式
    private String receiverPhone;
    //收货人邮箱
    private String receiverMail;
    //收货地址
    private String address;
    //订单备注
    private String remark;

    //商品id
    private List<Integer> productId;
   //商品列表
    private List<Product> products;
}
