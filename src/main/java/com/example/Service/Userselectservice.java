package com.example.Service;

import com.example.pojo.Resources;

import java.util.List;

public interface Userselectservice {
    public List<Resources> Userselect(String part, Resources resources);

    public Resources SelectResourcesByid(Integer resource_id);

    public List<Resources> SelectPassedResources();
}
