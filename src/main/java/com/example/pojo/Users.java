package com.example.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Users {
    private Integer userId;
    private String username;
    private Integer creditScore;
}
