package com.darkbright.frameworks.domain.dto;

import com.darkbright.frameworks.domain.entity.Role;

import java.util.List;

public class UserRole {
    /*private User user;*/
    
    private int id;
    private String name;
    private String passwd;
    private String email;

    private List<Role> role;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    
    public String getPasswd() {
        return passwd;
    }
    
    public void setPasswd(String password) {
        this.passwd = password == null ? null : password.trim();
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    /*public User getUser() {
            return user;
        }
        
        public void setUser(User user) {
            this.user = user;
        }
        */
    public List<Role> getRole() {
        return role;
    }
    
    public void setRole(List<Role> role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", role=" + role.toString() +
                '}';
    }
}
