package com.revolver.service.FrontEnd;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface EmailService {
    /**
     * 商品出售，通过id数组查询商品详情，向卖家发送通知
     * @param map
     * @return
     */
    public List<Map<String, String>> selectProductDetail(Map<String,Object> map);

    /**
     * 订单中商品状态更改，邮件通知
     * @param map
     * @return
     */
    public Map<String, String> selectProductDetailByOrder(Map<String, Object> map);
}
