package com.wanxi.mapper;

import com.wanxi.entity.Maes;
import com.wanxi.entity.Students;
import com.wanxi.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    List<User> all();
    User all(@Param("num") int num);
    User all(@Param("username") String userName);
    User all(@Param("username") String userName,@Param("num") int num);
    int deluser(@Param("uid") int uid);
    int add(@Param("num") String num);
    //创建触发器
    void trigger();
    //删除触发器
    void deltigger();
    List<User> ccg();

    void chuanjian();
    void del(@Param("num")String num,@Param("nums")Integer nums);
    Students stua();
    List<Maes> allmaes();



}
