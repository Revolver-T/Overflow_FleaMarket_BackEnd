package com.revolver.service.BackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public interface StatisService {

    /**
     * 查询当天日期是否存在
     * @param map
     * @return
     */
    public Map<String,Object> selectDateFromStatis(Map<String,Object> map) ;


    /**
     * 添加当日日期信息
     * @param map
     * @return
     */
    public int insertDateInStatis( Map<String,Object> map) ;

    /**
     * 修改当日点击量和访问量
     * @param map
     * @return
     */
    public int updateNumInStatis(Map<String, Object> map);

    /**
     * 查询网站统计的数据
     * @return
     */
    public Map<String,Object> selectDataNum() ;

    /**
     * 分类获取商品发布量
     * @return
     */
    public List<Integer> selectProductNumByFcid();


    /**
     * 分类获取商品交易额
     * @return
     */
    public List<Integer> selectProductMoneyByFcid();

    /**
     * 根据年份获取点击量
     * @param year
     * @return
     */
    public List<Object> selectClickNum(String year) ;

    //根据年份获取访问量
    public List<Object> selectVisitNum(String year);

    /**
     * 基于注解的延时函数
     */
    @Async
    @Scheduled(cron = "0 */15 * * * ?")
    public void Times();
}
