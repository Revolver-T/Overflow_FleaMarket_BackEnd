package com.revolver.controller.FrontEnd;

import com.revolver.pojo.FirstClassification;
import com.revolver.pojo.SecondClassification;
import com.revolver.service.FrontEnd.ClassifyService;
import com.revolver.service.FrontEnd.impl.ClassifyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "classify")
public class ClassifyController {
    @Autowired
    private ClassifyService classifyService;

    /**
     * 查询一级分类列表
     * @return
     */
    @RequestMapping(value = "/flnb",method = RequestMethod.GET)
    public List<FirstClassification> selectAllclass(){
        return classifyService.selectAllclass();
    }

    /**
     * 查询二级分类列表
     * @return
     */
    @RequestMapping(value = "/selectListScById",method = RequestMethod.GET)
    public List<SecondClassification> selectListScById(int id){
        return classifyService.selectListScById(id);
    }

    /**
     * 通过id查询一级分类对象
     * @param id
     * @return
     */
    @RequestMapping(value = "/selectFcById",method = RequestMethod.GET)
    public FirstClassification selectFcById(int id){
        return classifyService.selectFcById(id);
    }

    /**
     * 查询一级分类二级分类map集合
     * @return
     */
    @RequestMapping(value = "/selectFcScByList",method = RequestMethod.GET)
    public List<Map<String,Object>> selectFcScByList(){
        return classifyService.selectFcScByList();
    }

    /**
     * 查询二级分类对象
     * @return
     */
    @RequestMapping(value = "/selectScById",method = RequestMethod.GET)
    public SecondClassification selectScById(int id){
        return classifyService.selectScById(id);
    }

    /**
     * 查询二级分类列表
     * @return
     */
    @RequestMapping(value = "/selectScList",method = RequestMethod.GET)
    public List<SecondClassification> selectScList(){
        return classifyService.selectScList();
    }
}
