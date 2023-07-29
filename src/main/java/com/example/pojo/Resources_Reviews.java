package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class Resources_Reviews {
    private Integer reviewId;
    private Integer resourceId;
    private Integer userId;
    private String reviewContent;
    private Integer rating;
    @CreationTimestamp
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;
}
