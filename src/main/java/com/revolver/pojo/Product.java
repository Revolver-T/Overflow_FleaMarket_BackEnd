package com.revolver.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    //商品id
    private int id;
    //商品名称
    private String name;
    //商品描述
    private String details;
    //商品图片
    private String images;
    //商品点击量
    private int clicks;
    //商品创建时间
    private String createTime;
    //商品现价
    private Integer price;
    //交易方式
    private String deal;
    //交易地址
    private String address;
    //商品评论数量
    private String comments;
    //商品交易状态
    private String payed;
    //商品在线状态
    private String status;
    //商品类别
    private int sid;
    //发布人id
    private int uid;
}
