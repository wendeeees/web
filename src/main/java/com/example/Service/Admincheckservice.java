package com.example.Service;

import com.example.pojo.Resources;

import java.util.List;

public interface Admincheckservice {
    public void AdminCheck(Resources resources,boolean ifpass);
    public List<Resources> SelectResourcesforcheck();

}
