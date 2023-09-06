package com.revolver.service.FrontEnd.impl;

import com.revolver.service.FrontEnd.FileUploadService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class FileUploadServiceImpl implements FileUploadService {

    @Value("${web.upload-path}")
    private String uploadPath;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
    @Override
    public List<String> imgUpload(MultipartFile[] files) {
        List<String> result = new ArrayList<>();
        for (MultipartFile uploadFile : files) {

            //创建修改日期路径
            String format = sdf.format(new Date());
            File folder = new File(uploadPath + File.separator + format);

            if(!folder.isDirectory()){
                folder.mkdirs();
            }

            //时间戳+文件本名作为新文件名
            String fileName =  System.currentTimeMillis() + "-" + uploadFile.getOriginalFilename();
            try {
                uploadFile.transferTo(new File(folder, fileName));
                //静态资源访问地址返回
                result.add("http://localhost:1024/"+ format + fileName);
            } catch (IOException e){
                System.err.println(e.getMessage());
            }
        }
        return result;
    }
}
