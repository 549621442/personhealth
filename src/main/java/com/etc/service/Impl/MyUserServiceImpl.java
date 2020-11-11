package com.etc.service.Impl;

import com.etc.Enum.ErrorEnum;
import com.etc.dao.MyuserMapper;
import com.etc.entity.Myuser;
import com.etc.entity.MyuserExample;
import com.etc.exception.MyException;
import com.etc.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyUserServiceImpl implements MyUserService {
    @Autowired
    private MyuserMapper myuserMapper;

    @Override
    public Myuser doLogin(int uid, String password) {
        MyuserExample me = new MyuserExample();
        me.createCriteria().andUidEqualTo(uid).andUpwdEqualTo(password);
        List<Myuser> myusers = myuserMapper.selectByExample(me);
        if(myusers.size()==1){
            return myusers.get(0);
        }else {
            throw new MyException(ErrorEnum.NAMEORPWD_ERROR);
        }
    }

    @Override
    public List<Myuser> findAll() {
        return myuserMapper.selectByExample(null);
    }

    @Override
    public List<Myuser> findByCondition(MyuserExample me) {
        return myuserMapper.selectByExample(me);
    }

    @Override
    public Myuser findById(int uid) {
        MyuserExample me = new MyuserExample();
        me.createCriteria().andUidEqualTo(uid);
        return myuserMapper.selectByExample(me).get(0);
    }

    @Override
    public boolean addUser(Myuser myuser) {
        if(myuserMapper.insert(myuser)>0){
            return true;
        }else{
            throw new MyException(ErrorEnum.ADD_FAIL);
        }

    }

    @Override
    public boolean editUser(Myuser myuser) {
        return false;
    }

    @Override
    public boolean removeUser(List<Myuser> list) {
        return false;
    }
}
