package com.revolver.service.FrontEnd.impl;


import com.revolver.mapper.FrontEnd.ProductMapper;
import com.revolver.pojo.Product;
import com.revolver.service.FrontEnd.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> selectByNew() {
        return productMapper.selectByNew();
    }
    @Override
    public List<Product> selectByHot() {
        return productMapper.selectByHot();
    }
    @Override
    public Map<String,Object> selectProductById(int id) {
        return productMapper.selectProductById(id);
    }
    @Override
    public List<Product> selectScProductById(Map<String, Object>  param) {


        return productMapper.selectScProductById(param); }
    @Override
    public int insertProductByUser(Product product) {
        return productMapper.insertProductByUser(product);
    }
    @Override
    public List<Map<String,Object>> selectCommentById(int id) {
        return productMapper.selectCommentById(id);
    }
    @Override
    public int insertProductToLove(Map<String, Object> param) {
        return productMapper.insertProductToLove(param);
    }
    @Override
    public int selectLoveById(Map<String, Object> param){ return productMapper.selectLoveById(param); }
    @Override
    public int insertComment(Map<String, Object> param){
        return productMapper.insertComment(param);
    }
    @Override
    public List<Product> selectMyCollectById(int id){
        return productMapper.selectMyCollectById(id);
    }
    @Override
    public List<Map<String,Object>> selectMyProductById(int id){
        return productMapper.selectMyProductById(id);
    }
    @Override
    public int updateProductByUser(Product product){ return productMapper.updateProductByUser(product); }
    @Override
    public int deleteProductById(int id) {
        return productMapper.deleteProductById(id);
    }
    @Override
    public int deleteProductToLove(Map<String, Object> param) {
        return productMapper.deleteProductToLove(param);
    }
    @Override
    public int updateCommentById(Map<String, Object> param) {
        return productMapper.updateCommentById(param);
    }
    @Override
    public int soldOutProduct() {
        return productMapper.soldOutProduct();
    }
    @Override
    public List<Product> selectByCommend() {
        return productMapper.selectByCommend();
    }
    @Override
    public int updateOrderProductStatus(Map<String, Object> map) {
        return productMapper.updateOrderProductStatus(map);
    }
}