package com.revolver.service.BackEnd.impl;

import com.revolver.mapper.BackEnd.BackUserMapper;
import com.revolver.pojo.User;
import com.revolver.service.BackEnd.BackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BackUserServiceImpl implements BackUserService {


    @Autowired
    private BackUserMapper Mapper;
    @Override
    public List<Map<String, Object>> selectUserList(User user) {
        return Mapper.selectUserList(user);
    }
}
