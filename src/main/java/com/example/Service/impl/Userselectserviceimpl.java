package com.example.Service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.Mapper.UserMapper;
import com.example.Service.Userselectservice;
import com.example.pojo.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Userselectserviceimpl implements Userselectservice {
    @Autowired
    private UserMapper userMapper;
    public List<Resources> Userselect(String part, Resources resources){
        return userMapper.userselect(part,resources);
    }
    public Resources SelectResourcesByid(Integer resource_id){
        return userMapper.SelectResourcesByid(resource_id);
    }
    public List<Resources> SelectPassedResources(){
       return userMapper.SelectPassedResources();
    }






}
