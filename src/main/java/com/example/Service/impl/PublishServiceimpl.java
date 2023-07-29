package com.example.Service.impl;

import com.example.Mapper.UserMapper;
import com.example.Service.PublishService;
import com.example.pojo.Resources;
import com.example.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishServiceimpl implements PublishService {
    @Autowired
    private UserMapper userMapper;
    private final Integer LOWEST_SCORE = 60;//最低信用
    public Result ResourcesPublish(Resources resources){
//                这行有点别扭↓
        if(userMapper.SelectUserByid(resources.getUserId()).getCreditScore()>=LOWEST_SCORE){
            userMapper.ResourcesPublish(resources);
            return Result.success();
        }else {
           return Result.error("LOW_CREDIT");
        }
    }
}
