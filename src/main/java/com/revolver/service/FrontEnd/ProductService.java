package com.revolver.service.FrontEnd;

import com.revolver.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface ProductService {
    public List<Product> selectByNew();
    public List<Product> selectByHot();
    public Map<String,Object> selectProductById(int id);
    public List<Product> selectScProductById(Map<String, Object>  param);
    public int insertProductByUser(Product product);
    public List<Map<String,Object>> selectCommentById(int id);
    public int insertProductToLove(Map<String, Object> param);
    public int selectLoveById(Map<String, Object> param);
    public int insertComment(Map<String, Object> param);
    public List<Product> selectMyCollectById(int id);
    public List<Map<String,Object>> selectMyProductById(int id);
    public int updateProductByUser(Product product);
    public int deleteProductById(int id);
    public int deleteProductToLove(Map<String, Object> param);
    public int updateCommentById(Map<String, Object> param);
    public int soldOutProduct();
    public List<Product> selectByCommend();
    public int updateOrderProductStatus(Map<String, Object> map);
}
