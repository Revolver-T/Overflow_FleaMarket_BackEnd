package com.revolver.service.FrontEnd.impl;

import com.revolver.mapper.FrontEnd.ClassifyMapper;
import com.revolver.pojo.FirstClassification;
import com.revolver.pojo.SecondClassification;
import com.revolver.service.FrontEnd.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    private ClassifyMapper classifyMapper;

    @Override
    public List<FirstClassification> selectAllClass() {
        return classifyMapper.selectAllClass();
    }
    @Override
    public List<SecondClassification> selectListScById(int id) {
        return classifyMapper.selectListScById(id);
    }
    @Override
    public FirstClassification selectFcById(int id) { return classifyMapper.selectFcById(id);
    }
    @Override
    public List<Map<String,Object>> selectFcScByList() {
        return classifyMapper.selectFcScByList();
    }
    @Override
    public SecondClassification selectScById(int id) {
        return classifyMapper.selectScById(id);
    }
    @Override
    public List<SecondClassification> selectScList() {
        return classifyMapper.selectScList();
    }
}
