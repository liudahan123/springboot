package com.wanxi.service;

import com.wanxi.entity.Maes;
import com.wanxi.entity.Students;
import com.wanxi.entity.User;

import java.util.List;

public interface UserService {
    List<User> all();
    User all(int num);
    User all(String userName);
    User all(String userName,int num);
    int deluser(int uid);
    //创建触发器
    void trigger();
    //定向删除
    void del(String num,Integer nums);
    Students stua();

    List<Maes> allmaes();
}
