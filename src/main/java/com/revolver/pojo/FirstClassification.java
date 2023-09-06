package com.revolver.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirstClassification {
    //类别id
    private int id;
    //类别名称
    private String name;
}
