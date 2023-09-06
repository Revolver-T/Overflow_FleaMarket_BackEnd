package com.revolver.service.FrontEnd.impl;

import com.revolver.mapper.FrontEnd.EmailMapper;
import com.revolver.service.FrontEnd.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    EmailMapper mapper;

    @Override
    public List<Map<String, String>> selectProductDetail(Map<String, Object> map) {
        return mapper.selectProductDetail(map);
    }

    @Override
    public Map<String, String> selectProductDetailByOrder(Map<String, Object> map) {
        return mapper.selectProductDetailByOrder(map);
    }
}
