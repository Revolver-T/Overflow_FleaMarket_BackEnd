package com.revolver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SecondClassification {
    //二级分类id
    private int id;
    //二级分类名称
    private String name;
    //二级分类地址
    private String path;
    //所属一级分类id
    private int fcid;
}
