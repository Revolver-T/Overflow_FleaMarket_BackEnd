package com.revolver.service.FrontEnd;

import com.revolver.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CartService {
    public List<Product> selectCartById(int userid);

    public int deleteProductByArray(Map<String,Object> map);

    public int selectCartProductById(Map<String,Object> map);

    public int insertCartById(Map<String, Object> map) ;
}
