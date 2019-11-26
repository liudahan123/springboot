package com.wanxi.service.impl;

import com.wanxi.entity.Maes;
import com.wanxi.entity.Students;
import com.wanxi.entity.User;
import com.wanxi.mapper.UserMapper;
import com.wanxi.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService, InitializingBean {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void afterPropertiesSet() throws Exception {
       /* try {
            userMapper.deltigger();
        }catch (Exception e){
            userMapper.trigger();
        }finally {

        }*/
      // userMapper.chuanjian();

    }
    @Override
    public List<User> all() {
        List<User> alluser = userMapper.all();
        return alluser;
    }
    @Override
    public User all(int num) {
        User user = userMapper.all(num);
        return user;
    }

    @Override
    public User all(String userName) {
        User all = userMapper.all(userName);
        return all;
    }

    @Override
    public User all(String userName, int num) {
        User user = userMapper.all(userName, num);
        return user;
    }

    @Override
    public int deluser(int uid) {
        int num = userMapper.deluser(uid);
        return num;
    }
    @Override
    public void trigger() {
        userMapper.trigger();
    }

    @Override
    public void del(String num,Integer nums) {
         userMapper.del(num, nums);
    }

    @Override
    public Students stua() {
        Students stua = userMapper.stua();
        return stua;
    }

    @Override
    public List<Maes> allmaes() {
        List<Maes> maes = userMapper.allmaes();
        return maes;
    }
}
