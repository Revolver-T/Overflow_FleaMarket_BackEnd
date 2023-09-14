package com.revolver.service.BackEnd;

import com.revolver.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BackUserService {

    public List<Map<String,Object>> selectUserList(User user);
}
