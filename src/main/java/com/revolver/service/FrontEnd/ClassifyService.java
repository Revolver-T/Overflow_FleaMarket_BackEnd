package com.revolver.service.FrontEnd;

import com.revolver.mapper.FrontEnd.ClassifyMapper;
import com.revolver.pojo.FirstClassification;
import com.revolver.pojo.Result;
import com.revolver.pojo.SecondClassification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface ClassifyService {

    public List<FirstClassification> selectAllclass();
    public List<SecondClassification> selectListScById(int id);

    public FirstClassification selectFcById(int id);



    public List<Map<String,Object>> selectFcScByList();

    public SecondClassification selectScById(int id);

    public List<SecondClassification> selectScList();
}
