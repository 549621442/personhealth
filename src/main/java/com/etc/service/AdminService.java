package com.etc.service;

import com.etc.entity.Admin;

public interface AdminService {
    Admin doLogin(int aid,String password);
}
