package com.revolver.controller.FrontEnd;

import com.revolver.service.FrontEnd.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.mail.javamail.JavaMailSender;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.springframework.mail.SimpleMailMessage;

@RestController
@RequestMapping(value = "/email")
public class EmailController {

    @Autowired
    JavaMailSender javaMailSender;

    @Autowired
    private EmailService service;

    @RequestMapping(value = "/sendMail",method = RequestMethod.GET)
    public String sendMail(String mailTo){
        //生成验证码
        String sources = "0123456789"; // 加上一些字母，就可以生成pc站的验证码了
        Random rand = new Random();
        StringBuffer flag = new StringBuffer();
        for (int j = 0; j < 6; j++){
            flag.append(sources.charAt(rand.nextInt(9)) + "");
        }
        String verifycode = flag.toString();

        //设置邮件内容
        String mailText = "Overflow: 验证码："+verifycode+"   您正在注册唐院二手交易网站账号，请勿将验证码告诉他人哦。";

        if(!mailTo.isEmpty()){
            toMail(mailTo,mailText);
        }else{
            verifycode=null;
        }

        return verifycode;
    }



    @RequestMapping(value = "/sendMailToUser",method = RequestMethod.POST)
    public void sendMailToUser(@RequestBody Map<String,Object> map){

        List<Map<String,String>> list = service.selectProductDetail(map);
        for (Map<String, String> arr:list) {
            String mailText = "您在Overflow:网站发布的《"+arr.get("name")+"》已出售";
            toMail(arr.get("mail").toString(),mailText);
        }
    }


    @RequestMapping(value = "/sendMailToBuyer",method = RequestMethod.POST)
    public void sendMailToBuyer(@RequestBody Map<String,Object> map){
        Map<String,String> MapObject = service.selectProductDetailByOrder(map);
        int type = (int) map.get("status");
        if(type == 2){
            String mailText = "Overflow:您购买的《"+MapObject.get("name")+"》已发货";
            toMail(MapObject.get("mail"),mailText);
        }else if(type == 3){
            String mailText = "Overflow:您发布的《"+MapObject.get("name")+"》已送达";
            toMail(MapObject.get("mail"),mailText);
        }else if(type == 4){
            String mailText = "Overflow:您出售的《"+MapObject.get("name")+"》正在申请退款，请及时处理！";
            toMail(MapObject.get("mail"),mailText);
        }else if(type == 5){
            String mailText = "Overflow:您购买的《"+MapObject.get("name")+"》退款成功！";
            toMail(MapObject.get("mail"),mailText);
        }else if(type == 6){
            String mailText = "Overflow:您购买的《"+MapObject.get("name")+"》退款失败！";
            toMail(MapObject.get("mail"),mailText);
        }
    }



    public void toMail(String mailTo,String mailText){
        //定义发送标题
        String title = "Overflow二手交易市场";
        //设置发送方
        String mailFrom = "t18713827231@163.com";
        try {
            //构建邮件对象
            SimpleMailMessage message = new SimpleMailMessage();
            //设置邮件主题
            message.setSubject(title);
            //设置邮件发送者
            message.setFrom(mailFrom);
            //设置邮件接收者
            message.setTo(mailTo);
            //设置邮件发送日期
            message.setSentDate(new Date());
            //设置邮件正文
            message.setText(mailText);
            //发送邮件
            javaMailSender.send(message);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

