package com.darkbright.frameworks.domain.entity;

/**
 * Created by bright on 2018/1/7.
 *
 * @author bright
 */
public class UserInfo {
    private int id;
    private int userId;
    private String nickname;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getNickname() {
        return nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
