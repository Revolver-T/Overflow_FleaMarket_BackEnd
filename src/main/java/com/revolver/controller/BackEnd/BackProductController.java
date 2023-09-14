package com.revolver.controller.BackEnd;

import com.revolver.pojo.Product;
import com.revolver.service.BackEnd.BackProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 后台商品模块
 */
@RestController
@RequestMapping(value = "/productFromBack")
public class BackProductController {

    @Autowired
    private BackProductService Service;

    /**
     * 查询所有商品列表接口
     * @param pro
     * @return
     */
    @RequestMapping(value = "/selectProductList",method = RequestMethod.POST)
    public List<Map<String,Object>> selectProductList(@RequestBody Product pro){
        return Service.selectProductList(pro);
    }


    /**
     * 查询所有商品列表接口
     * @param pro
     * @return
     */
    @RequestMapping(value = "/selectProductCommentList",method = RequestMethod.POST)
    public List<Map<String,Object>> selectProductCommentList(@RequestBody Product pro){
        return Service.selectProductCommentList(pro);
    }

}
