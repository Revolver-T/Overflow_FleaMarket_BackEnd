package com.revolver.controller.FrontEnd;

import com.revolver.service.FrontEnd.FileUploadService;
import com.revolver.utils.AliOSSUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/fileUpload")
public class FileUploadController {


    @Autowired
    private FileUploadService fileUploadService;
    @Autowired
    private AliOSSUtils aliOSSUtils;
    /**
     * 图片上传接口
     * @return String
     */
    @RequestMapping(value = "/imgUpload" ,method = RequestMethod.POST)
    public List<String> imgUpload(@RequestParam("file") MultipartFile[] file) throws Exception{
//        return fileUploadService.imgUpload(file);
        List<String> result = new ArrayList<>();
        for(MultipartFile theFile : file){
            String tmp = aliOSSUtils.upload(theFile);
            System.out.println(tmp);
            result.add(tmp);
        }

        return result;
    }
}
