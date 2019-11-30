package com.yuhj.springbootmybatis.service;

import com.yuhj.springbootmybatis.entity.user;
import com.yuhj.springbootmybatis.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {


    /**
     * 注入dao
     */
    @Autowired
    private userMapper usermapper;

    //用户登录
    public user userLogin(String username,String password){
        user user = usermapper.userlogin(username,password);
        return user;
    }

    //注册新用户
    public int adduser1(String username,String password,int age){
        //return usermapper.adduser(username,password,age);
        return usermapper.adduser1(username,password,age);     //对应sql语句中的第二种注册方式
    }



}
