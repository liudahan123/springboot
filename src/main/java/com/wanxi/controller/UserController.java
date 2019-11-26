package com.wanxi.controller;

import com.wanxi.entity.Maes;
import com.wanxi.entity.Students;
import com.wanxi.entity.User;

import com.wanxi.service.UserService;
import com.wanxi.utils.AllPowerful;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private AllPowerful allPowerful;
    @Autowired
    private UserService userService;
    @RequestMapping("/alladd")
    public List<User> userall(){
        List<User> list = userService.all();
        System.out.println("长度"+list.size());
        System.out.println(list);
        return list;
    }
    @RequestMapping("/oneuser")
    public User chauser(){
        User user = userService.all(5);
        return user;
    }
    @RequestMapping("/username")
    public User chausers(){
        User user = userService.all("张三");
        return user;
    }
    @RequestMapping("/usernames")
    public User chauserss(){
        User user = userService.all("张三",0);
        return user;
    }
    @RequestMapping("/del")
    public int deltigger(int id){
        int user = userService.deluser(id);
        return user;
    }
    @RequestMapping("/deld")
    public void dx(String num,String nums){
        System.out.println("num:"+num);
        System.out.println("nums"+nums);
        Integer i1 = Integer.parseInt(nums);
       userService.del(AllPowerful.ALLFIRST, i1);
    }
    @RequestMapping("/stus")
    public void dd(){
        Students stua = userService.stua();
        System.out.println(stua);
    }
    @RequestMapping("/allmaes")
    public List<Maes> allmaesa(){
        List<Maes> maesList = userService.allmaes();
        return maesList;
    }
}
