package com.darkbright.frameworks.domain.entity;

import java.util.Date;

/**
 * Created by bright on 2018/1/7.
 *
 * @author bright
 */
public class User {
    private Long id;
    private String nickname;
    private String passwd;
    private String email;
    private String phone;
    private Date createTime;
    private Date updateTime;
    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return updateTime;
    }

    public void setModifyTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDelete(Boolean deleted) {
        this.deleted = deleted;
    }
}
