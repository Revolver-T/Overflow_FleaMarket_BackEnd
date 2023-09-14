package com.revolver.service.BackEnd.impl;

import com.revolver.mapper.BackEnd.BackAdminMapper;
import com.revolver.pojo.Admin;
import com.revolver.service.BackEnd.BackAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BackAdminServiceImpl implements BackAdminService {

    @Autowired
    private BackAdminMapper Mapper;


    @Override
    public List<Admin> selectAdminList(Admin admin) {
        return Mapper.selectAdminList(admin);
    }

    @Override
    public int updateAdminById(Admin admin) {
        return Mapper.updateAdminById(admin);
    }

    @Override
    public int deleteAdminById(int id) {
        return Mapper.deleteAdminById(id);
    }

    @Override
    public Admin selectAdminByUser(Admin admin) {
        return Mapper.selectAdminByUser(admin);
    }

    @Override
    public int InsertAdminByAdmin(Admin admin) {
        return Mapper.InsertAdminByAdmin(admin);
    }
}
