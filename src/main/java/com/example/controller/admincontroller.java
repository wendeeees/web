package com.example.controller;

import com.example.Service.Admincheckservice;
import com.example.Service.CreditEvaluateservice;
import com.example.pojo.Resources;
import com.example.pojo.Result;
import com.example.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class admincontroller {

    @Autowired
    private Admincheckservice admincheckservice;
    @Autowired
    private CreditEvaluateservice creditEvaluateservice;


//审核资源是否通过
    @RequestMapping("/check/{ifpass}")
    public Result Checkpass (@RequestBody Resources resources, @PathVariable String ifpass){
        admincheckservice.AdminCheck(resources,Boolean.parseBoolean(ifpass));
        return Result.success();
    }
//获取待审核列表
    @RequestMapping("/selectforcheck")
    public Result adminselect(){
        return Result.success( admincheckservice.SelectResourcesforcheck());
    }
//信用值评定
    @RequestMapping("/evaluate")
    public Result CreditEvaluate(@RequestBody Users users){
        creditEvaluateservice.CreditEvaluate(users);
        return Result.success();
    }
}
