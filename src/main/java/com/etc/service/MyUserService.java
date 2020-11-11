package com.etc.service;

import com.etc.entity.Myuser;
import com.etc.entity.MyuserExample;

import java.util.List;

public interface MyUserService {
   public Myuser doLogin(int uid,String password);
   public List<Myuser> findAll();
   public List<Myuser> findByCondition(MyuserExample me);
   public Myuser findById(int uid);
   public boolean addUser(Myuser myuser);
   public boolean editUser(Myuser myuser);
   public boolean removeUser(List<Myuser> list);

}
