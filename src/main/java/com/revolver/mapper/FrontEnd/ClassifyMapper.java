package com.revolver.mapper.FrontEnd;

import com.revolver.pojo.FirstClassification;
import com.revolver.pojo.SecondClassification;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface ClassifyMapper {

    //一级分类列表接口
    List<FirstClassification> selectAllclass();
    //二级分类列表接口
    List<SecondClassification> selectListScById(int id);
    //一级分类对象接口
    FirstClassification selectFcById(int id);
    //一级分类二级分类全数据接口
    List<Map<String,Object>> selectFcScByList();
    //二级分类对象接口
    SecondClassification selectScById(int id);
    //二级分类列表
    List<SecondClassification> selectScList();
}
