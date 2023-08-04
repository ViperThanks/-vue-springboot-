package com.yiren.controller;

import com.yiren.comon.ResponseResult;
import com.yiren.entity.Admin;
import com.yiren.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController{

    @Autowired
    private LoginService loginSercice;
    @PostMapping("/admin/login")
    public ResponseResult login(@RequestBody Admin admin){
       return loginSercice.login(admin);
    }

    @GetMapping("/loginOut")
    public ResponseResult logout(){
        return loginSercice.logout();
    }

    

}
