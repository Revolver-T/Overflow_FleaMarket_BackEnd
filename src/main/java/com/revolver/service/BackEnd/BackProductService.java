package com.revolver.service.BackEnd;


import com.revolver.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BackProductService {


    public List<Map<String,Object>> selectProductList(Product pro);

    public List<Map<String, Object>> selectProductCommentList(Product pro);
}
