package com.revolver.service.BackEnd.impl;


import com.revolver.mapper.BackEnd.BackProductMapper;
import com.revolver.pojo.Product;
import com.revolver.service.BackEnd.BackProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BackProductServiceImpl implements BackProductService {

    @Autowired
    private BackProductMapper mapper;

    @Override
    public List<Map<String, Object>> selectProductList(Product pro) {
        return mapper.selectProductList(pro);
    }

    @Override
    public List<Map<String, Object>> selectProductCommentList(Product pro) {
        return mapper.selectProductCommentList(pro);
    }
}
