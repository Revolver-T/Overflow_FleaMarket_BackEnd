package com.revolver.service.FrontEnd;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Service
public interface FileUploadService {
    public List<String> imgUpload(MultipartFile[] files);
}
