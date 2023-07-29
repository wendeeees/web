package com.example.Service;

import com.example.pojo.Resources;
import com.example.pojo.Resources_Reviews;

import java.util.List;

public interface UserCommentservice {
    public void UserComment(Resources_Reviews resourcesReviews);
    public List<Resources_Reviews> SelectResourceReviews(Resources Resources);
}
