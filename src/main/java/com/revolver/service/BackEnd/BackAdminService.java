package com.revolver.service.BackEnd;

import com.revolver.pojo.Admin;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BackAdminService {
    public List<Admin> selectAdminList(Admin admin);

    public int updateAdminById(Admin admin);

    public int deleteAdminById(int id);

    public Admin selectAdminByUser(Admin admin);

    public int InsertAdminByAdmin(Admin admin);
}
