package com.wanxi.utils;

import com.wanxi.entity.User;
import com.wanxi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 标识
 */
@Component
public  class AllPowerful {
    public static final String ALLFIRST="first";//first表
    public static final String ALLSTUDENTS="students";//students表
    public static final String ALLADD="add";//students增加
    public static final String ALLDEL="del";//students删除
    public static final String ALLALTER="alter";//students修改
}
