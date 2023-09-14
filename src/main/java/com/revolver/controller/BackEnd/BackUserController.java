package com.revolver.controller.BackEnd;

import com.revolver.pojo.User;
import com.revolver.service.BackEnd.BackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 后台用户模块
 */
@RestController
@RequestMapping(value = "/userFromBack")
public class BackUserController {
    @Autowired
    private BackUserService Service;

    /**
     * 查询网站用户列表
     * @return
     */
    @RequestMapping(value = "/selectUserList",method = RequestMethod.POST)
    public List<Map<String,Object>> selectUserList(@RequestBody User user){
        return Service.selectUserList(user);
    }
}
