package com.revolver.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    //用户id
    private int userId;
    //用户名
    private String username;
    //用户密码
    private String password;
}
