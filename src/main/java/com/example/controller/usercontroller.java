package com.example.controller;

import com.example.Service.*;
import com.example.pojo.Resources;
import com.example.pojo.Resources_Reviews;
import com.example.pojo.Result;
import com.example.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class usercontroller {
    @Autowired
    private PublishService publishService;
    @Autowired
    private Userselectservice userselectservice;
    @Autowired
    private UserCommentservice userCommentservice;

//发布资源
    @RequestMapping("/publish")
    public Result Publish(@RequestBody Resources resources){
        publishService.ResourcesPublish(resources);
        return publishService.ResourcesPublish(resources);
    }
//显示全部过审资源
    @RequestMapping("/select")
    public Result Userselectall(){
        return Result.success( userselectservice.SelectPassedResources());
    }
//通过关键字或资源类型等查找资源
    @RequestMapping("/select/{part}")
    public Result Userselect(@RequestBody Resources resources,@PathVariable String part){
        return Result.success( userselectservice.Userselect(part,resources));
    }
//获取资源
    @RequestMapping("/resource/{resourceId}")
    public Result Userconsult(@PathVariable String resourceId){
        return Result.success( userselectservice.SelectResourcesByid(Integer.parseInt(resourceId)));
    }
//评价资源
    @RequestMapping("/comment")
    public Result UserComment(@RequestBody Resources_Reviews resourcesReviews){
        userCommentservice.UserComment(resourcesReviews);
        return Result.success();
    }
//获取资源评价
    @RequestMapping("/selectcomment")
    public Result UserselectComment(@RequestBody Resources resources){
        return Result.success(userCommentservice.SelectResourceReviews(resources));
    }
}
