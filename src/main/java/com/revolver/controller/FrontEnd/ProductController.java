package com.revolver.controller.FrontEnd;

import com.revolver.pojo.Product;
import com.revolver.pojo.Result;
import com.revolver.service.FrontEnd.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/selectByNew",method = RequestMethod.GET)
    public Result selectByNew(){
        return Result.success(productService.selectByNew());
    }


    @RequestMapping(value = "/selectByHot",method = RequestMethod.GET)
    public Result selectByHot(){
        return Result.success(productService.selectByHot()) ;
    }


    @RequestMapping(value = "/selectProductById",method = RequestMethod.GET)
    public Map<String, Object> selectProductById(int id){
        return productService.selectProductById(id);
    }


    @RequestMapping(value = "/selectScProductById",method = RequestMethod.POST)
    public List<Product> selectScProductById(@RequestBody Map<String, Object> param){
        return productService.selectScProductById(param);
    }


    @RequestMapping(value = "/insertProductByUser",method = RequestMethod.POST)
    public int insertProductByUser(@RequestBody Product product){
        return productService.insertProductByUser(product);
    }


    @RequestMapping(value = "/selectCommentById",method = RequestMethod.GET)
    public List<Map<String, Object>> selectCommentById(int id){
        return productService.selectCommentById(id) ;
    }


    @RequestMapping(value = "/insertProductToLove",method = RequestMethod.POST)
    public int insertProductToLove(@RequestBody Map<String, Object> param){
        return productService.insertProductToLove(param) ;
    }


    @RequestMapping(value = "/selectLoveById",method = RequestMethod.POST)
    public int selectLoveById(@RequestBody Map<String, Object> param){
        return productService.selectLoveById(param) ;
    }


    @RequestMapping(value = "/insertComment",method = RequestMethod.POST)
    public int insertComment(@RequestBody Map<String, Object> param){
        return productService.insertComment(param) ;
    }


    @RequestMapping(value = "/selectMyCollectById",method = RequestMethod.GET)
    public List<Product> selectMyCollectById(int id){
        return productService.selectMyCollectById(id) ;
    }


//    List<Map<String,Object>>
    @RequestMapping(value = "/selectMyProductById",method = RequestMethod.GET)
    public List<Map<String,Object>> selectMyProductById(int id){
        return productService.selectMyProductById(id) ;
    }


    @RequestMapping(value = "/updateProductByUser",method = RequestMethod.POST)
    public Result updateProductByUser(@RequestBody Product product){
        return Result.success(productService.updateProductByUser(product)) ;
    }


    @RequestMapping(value = "/deleteProductById",method = RequestMethod.GET)
    public Result deleteProductById(int id){
        return Result.success(productService.deleteProductById(id)) ;
    }


    @RequestMapping(value = "/deleteProductToLove",method = RequestMethod.POST)
    public Result deleteProductToLove(@RequestBody Map<String, Object> param){
        return Result.success( productService.deleteProductToLove(param));
    }


    @RequestMapping(value = "/updateCommentById",method = RequestMethod.POST)
    public Result updateCommentById(@RequestBody Map<String, Object> param){
        return Result.success(productService.updateCommentById(param)) ;
    }


    @RequestMapping(value = "/soldOutProduct",method = RequestMethod.GET)
    public Result soldOutProduct(){
        return Result.success(productService.soldOutProduct()) ;
    }


    @RequestMapping(value = "/selectByCommend",method = RequestMethod.GET)
    public Result selectByCommend(){
        return Result.success(productService.selectByCommend());
    }


    @RequestMapping(value = "/updateOrderProductStatus",method = RequestMethod.POST)
    public int updateOrderProductStatus(@RequestBody Map<String,Object> map){
        return productService.updateOrderProductStatus(map) ;
    }
}
