package com.example.Mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pojo.Resources;
import com.example.pojo.Resources_Reviews;
import com.example.pojo.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("insert into no3data.resources(resource_id,title,category,content,status,user_id,created_at,updated_at,admin_name)" +
            "value(#{resourceId},#{title},#{category},#{content},#{status},#{userId},#{createdAt},#{updatedAt},#{adminName}) ")
    public void ResourcesPublish(Resources resources);
    @Select("select * from no3data.users where user_id=#{user_id}")
    public Users SelectUserByid(Integer user_id);


    public List<Resources> userselect(String part,Resources Resources);
    @Select("select * from no3data.resources where resource_id=#{resource_id}")
    public Resources SelectResourcesByid(Integer resource_id);

    @Insert("insert into no3data.resource_reviews(resource_id,user_id,review_content,rating,created_at,updated_at)" +
            "value(#{resourceId},#{userId},#{reviewContent},#{rating},#{createdAt},#{updatedAt}) ")
    public void UserComment(Resources_Reviews resourcesReviews);

    @Select("select * from no3data.resources where status=1")
    public List<Resources> SelectPassedResources();

    @Select("select * from no3data.resource_reviews where resource_id=#{resourceId}")
    public List<Resources_Reviews> SelectResourceReviews(Resources Resources);
}
