package com.darkbright.frameworks.domain.dto;

import com.darkbright.frameworks.domain.entity.User;
import com.darkbright.frameworks.domain.entity.UserInfo;

public class UserDetail extends User {
    private UserInfo userInfo;
    
    
    public UserInfo getUserInfo() {
        return userInfo;
    }
    
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    
    @Override
    public String toString() {
    
        return "UserDetail{userId = " + super.getId() +
                ", userName = " + super.getNickname() +
                ", userPassword = " + super.getPasswd() +
                ", nickname = " + userInfo.getNickname();
    }
}
