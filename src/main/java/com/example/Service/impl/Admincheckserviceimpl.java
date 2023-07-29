package com.example.Service.impl;

import com.example.Mapper.AdminMapper;
import com.example.Service.Admincheckservice;
import com.example.pojo.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Admincheckserviceimpl implements Admincheckservice {
    @Autowired
    private AdminMapper adminMapper;
    public void AdminCheck(Resources resources,boolean ifpass){
        if(ifpass){
            adminMapper.Admincheck(1,resources);
        } else  {
            adminMapper.Admincheck(-1,resources);
        }
    }

    public List<Resources> SelectResourcesforcheck(){
       return adminMapper.SelectResourcesforcheck();
    }
}
