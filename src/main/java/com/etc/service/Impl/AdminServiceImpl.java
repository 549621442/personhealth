package com.etc.service.Impl;

import com.etc.Enum.ErrorEnum;
import com.etc.dao.AdminMapper;
import com.etc.entity.Admin;
import com.etc.entity.AdminExample;
import com.etc.exception.MyException;
import com.etc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin doLogin(int aid, String password) {
        AdminExample ae = new AdminExample();
        ae.createCriteria().andAidEqualTo(aid).andPasswordEqualTo(password);
        List<Admin> admin = adminMapper.selectByExample(ae);
        if(admin.size()==1){
            return admin.get(0);
        }else{
            throw  new MyException(ErrorEnum.NAMEORPWD_ERROR);
        }

    }
}
