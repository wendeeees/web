package com.example.Service.impl;

import com.example.Mapper.AdminMapper;
import com.example.Service.CreditEvaluateservice;
import com.example.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditEvaluateserviceimpl implements CreditEvaluateservice {
    @Autowired
    private AdminMapper adminMapper;
    private final Integer PUBLISHER_BONUS = 10;
    public void CreditEvaluate(Users users){
        adminMapper.creditevaluate(users,PUBLISHER_BONUS );
    }
}
