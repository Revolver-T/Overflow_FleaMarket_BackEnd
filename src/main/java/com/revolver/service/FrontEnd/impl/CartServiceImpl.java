package com.revolver.service.FrontEnd.impl;

import com.revolver.mapper.FrontEnd.CartMapper;
import com.revolver.pojo.Product;
import com.revolver.service.FrontEnd.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper mapper;

    @Override
    public List<Product> selectCartById(int userid) {
        return mapper.selectCartById(userid);
    }

    @Override
    public int deleteProductByArray(Map<String, Object> map) {
        return mapper.deleteProductByArray(map);
    }

    @Override
    public int selectCartProductById(Map<String, Object> map) {
        return mapper.selectCartProductById(map);
    }

    @Override
    public int insertCartById(Map<String, Object> map) {
        return mapper.insertCartById(map);
    }
}
