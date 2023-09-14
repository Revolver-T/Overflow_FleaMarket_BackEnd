package com.revolver.service.BackEnd.impl;

import com.revolver.mapper.BackEnd.StatisMapper;
import com.revolver.service.BackEnd.StatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class StatisServiceImpl implements StatisService {

    @Autowired
    StatisMapper mapper;

    @Override
    public Map<String, Object> selectDateFromStatis(Map<String, Object> map) {
        return mapper.selectDateFromStatis(map);
    }

    @Override
    public int insertDateInStatis(Map<String, Object> map) {
        return mapper.insertDateInStatis(map);
    }

    @Override
    public int updateNumInStatis(Map<String, Object> map) {
        return mapper.updateNumInStatis(map);
    }

    @Override
    public Map<String, Object> selectDataNum() {
        int productSevenNum = mapper.selectProductSevenNum();
        int productTotalNum = mapper.selectProductNum();
        int userMoonNum = mapper.selectUserNum();
        int userTotalNum = mapper.selectUserMoonNum();
        int orderSevenNum = mapper.selectOrderSevenNum();
        int orderTotalNum = mapper.selectOrderNum();
        int commentSevenNum = mapper.selectCommentSevenNum();
        int commentTotalNum = mapper.selectCommentNum();
        int moneyMoonNum = mapper.selectMoneyMoonNum();
        int moneyTotalNum = mapper.selectMoneyNum();


        Map<String,Object> map = new HashMap<>();
        map.put("productSevenNum",productSevenNum);
        map.put("productTotalNum",productTotalNum);
        map.put("userMoonNum",userMoonNum);
        map.put("userTotalNum",userTotalNum);
        map.put("orderSevenNum",orderSevenNum);
        map.put("orderTotalNum",orderTotalNum);
        map.put("commentSevenNum",commentSevenNum);
        map.put("commentTotalNum",commentTotalNum);
        map.put("moneyMoonNum",moneyMoonNum);
        map.put("moneyTotalNum",moneyTotalNum);
        return map;
    }

    @Override
    public List<Integer> selectProductNumByFcid() {
        return mapper.selectProductNumByFcid();
    }

    @Override
    public List<Integer> selectProductMoneyByFcid() {
        return mapper.selectProductMoneyByFcid();
    }

    @Override
    public List<Object> selectClickNum(String year) {
        Map<String,Object> map = mapper.selectClickNum(year);
        List<Object> list = new ArrayList<>();
        for(int i=1;i<13;i++){
            list.add(map.get(String.valueOf(i)));
        }
        return list;
    }

    @Override
    public List<Object> selectVisitNum(String year) {
        Map<String,Object> map = mapper.selectVisitNum(year);
        List<Object> list = new ArrayList<>();
        for(int i=1;i<13;i++){
            list.add(map.get(String.valueOf(i)));
        }
        return list;
    }

    @Override
    public void Times() {
        mapper.deleteOrderByPay();
    }
}
