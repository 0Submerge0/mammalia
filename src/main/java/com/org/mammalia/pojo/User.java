package com.org.mammalia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * t_user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    /**
     * 主键,用户id
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String userPassword;
    /**
     * 地址
     */
    private String userAddress;
    /**
     * 电话
     */
    private String userPhone;
    /**
     * 性别
     */
    private String userGender;
    /**
     * 邮箱
     */
    private String userEmail;
}
