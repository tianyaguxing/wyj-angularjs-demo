package com.wyj.entity;

import java.io.Serializable;
/**
 * 用户entity
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月15日 下午5:46:06
 */
public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Long userId;

    private String userName;// 用户名

    private Integer sex;

    private String phone;// 号码

    private String email;// 邮箱

    private String address;// 地址

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
