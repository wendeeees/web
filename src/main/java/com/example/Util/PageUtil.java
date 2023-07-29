package com.example.Util;

import com.github.pagehelper.Page;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.web.server.ErrorPageRegistrarBeanPostProcessor;

import java.util.List;

public class PageUtil {
    public static PageBeanUtil page(Integer page, Integer pagesize, List<Object> list){
        PageHelper.startPage(page,pagesize);
        Page<Object> p=(Page<Object>)list;
        PageBeanUtil PageBean=new PageBeanUtil(p.getTotal(),p.getResult());
        return PageBean;
    }
}
