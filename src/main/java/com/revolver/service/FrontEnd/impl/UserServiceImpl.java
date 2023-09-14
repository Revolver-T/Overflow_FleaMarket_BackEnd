package com.revolver.service.FrontEnd.impl;

import com.revolver.mapper.FrontEnd.OrderMapper;
import com.revolver.mapper.FrontEnd.ProductMapper;
import com.revolver.mapper.FrontEnd.UserMapper;
import com.revolver.pojo.Account;
import com.revolver.pojo.User;
import com.revolver.service.FrontEnd.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Account toLogin(Account account) {
        if(account.getUsername().isEmpty()){
            return null;
        }
        return userMapper.toLogin(account);
    }

    @Override
    public User selectUserById(int id) {
        if(id == 0){
            return null;
        }
        return userMapper.selectUserById(id);
    }

    @Override
    public int updateUserById(User user) {
        if(user.getId() == 0){
            return -1;
        }
        userMapper.updateAccountById(user);
        return userMapper.updateUserById(user);
    }

    @Override
    public int selectCountById(Integer id) {
        if(id == null){
            return -1;
        }
        return userMapper.selectCountById(id);
    }

    @Override
    @Transactional
    public int deleteUserById(Integer id) {
         userMapper.deleteUserById(id);
         productMapper.deleteProductByUserId(id);
         orderMapper.deleteOrderByUserId(id);
         return userMapper.deleteAccountById(id);
    }

    @Override
    public int restAccountById(Integer id) {
        return userMapper.restAccountById(id);
    }

    @Override
    public int insertUserInfo(User user) {
        userMapper.insertUserInfo(user);
        return user.getId();
    }

    @Override
    public int insertUserToAccount(Account account) {
        return userMapper.insertUserToAccount(account);
    }

    @Override
    public int selectCartCountById(int id) {
        return userMapper.selectCartCountById(id);
    }

    @Override
    public int selectCommentById(int id) {
        return userMapper.selectCommentById(id);
    }

    @Override
    public Account selectAccountById(int id) {
        return userMapper.selectAccountById(id);
    }
}
