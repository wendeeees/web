package com.example.Service.impl;

import com.example.Mapper.UserMapper;
import com.example.Service.UserCommentservice;
import com.example.pojo.Resources;
import com.example.pojo.Resources_Reviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCommentserviceimpl implements UserCommentservice {
@Autowired
    private UserMapper userMapper;
    public void UserComment(Resources_Reviews resourcesReviews){
        userMapper.UserComment(resourcesReviews);
    }
    public List<Resources_Reviews> SelectResourceReviews(Resources Resources){
        return userMapper.SelectResourceReviews(Resources);
    }
}
