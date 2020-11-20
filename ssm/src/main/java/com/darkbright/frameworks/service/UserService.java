package com.darkbright.frameworks.service;

import com.darkbright.frameworks.domain.dto.UserDetail;
import com.darkbright.frameworks.domain.dto.UserRole;
import com.darkbright.frameworks.domain.entity.User;

import java.util.List;

/**
 * Created by bright on 2018/1/7.
 *
 * @author bright
 */
public interface UserService {
    /**
     * 通过Id获取用户信息
     *
     * @param uid 用户id
     * @return User
     */
    User getUser(Long uid);
    
    /**
     * 获取所有用户信息
     *
     * @return List<User>
     */
    List<User> getUsers();
    
    /**
     * 获取用户详细信息
     * @return
     */
    List<UserDetail> getUserDetail();
    
    /**
     * 获取单个用户的信息和角色列表
     * @param id
     * @return
     */
    UserRole getUserRoleById(Long id);
    
    /**
     * 获取用户的信息和角色列表
     * @return
     */
    List<UserRole> getUserRole();
    
    /**
     * 添加用户
     *
     * @param user 要插入的用户
     * @return int, 1 for success
     */
    int addUser(User user);
    
    /**
     * 修改用户
     * @param user 要修改的用户
     * @return int, 1 for success
     */
    int updateUser(User user);
    
    /**
     * 删除用户
     * @param uid 用户id
     * @return int, 1 for success
     */
    int delUser(Long uid);
    
}
