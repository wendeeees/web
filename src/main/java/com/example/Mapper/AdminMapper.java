package com.example.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pojo.Resources;
import com.example.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Objects;

@Mapper
public interface AdminMapper extends BaseMapper<Object> {
    @Update("update no3data.resources set status=#{set} where resource_id=#{resources.resourceId};")
    public void Admincheck(Integer set, Resources resources);

    @Select("select * from no3data.resources where status=0")
    public List<Resources> SelectResourcesforcheck();

    @Update("update no3data.users set credit_score=#{user.creditScore}+#{bonus} where user_id=#{user.userId};")
    public void creditevaluate (Users user, Integer bonus);


}
