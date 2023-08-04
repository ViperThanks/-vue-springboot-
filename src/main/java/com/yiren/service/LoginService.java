package com.yiren.service;

import com.yiren.comon.ResponseResult;
import com.yiren.entity.Admin;

public interface LoginService {

    ResponseResult login(Admin admin);

    ResponseResult logout();

}
