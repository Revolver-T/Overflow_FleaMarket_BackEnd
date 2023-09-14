package com.revolver.mapper.BackEnd;

import com.revolver.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface BackUserMapper {
    //查询用户信息列表
    List<Map<String,Object>> selectUserList(User user);
}
