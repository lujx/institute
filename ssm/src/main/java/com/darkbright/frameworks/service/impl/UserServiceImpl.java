package com.darkbright.frameworks.service.impl;

import com.darkbright.frameworks.dao.UserDao;
import com.darkbright.frameworks.domain.dto.UserDetail;
import com.darkbright.frameworks.domain.dto.UserRole;
import com.darkbright.frameworks.domain.entity.User;
import com.darkbright.frameworks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bright on 2018/1/7.
 *
 * @author bright
 */
@Service
public class UserServiceImpl implements UserService {
    
    private UserDao userDao;
    
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }
    
    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
    
    @Override
    public List<UserDetail> getUserDetail() {
        return userDao.getUserDetailByResultMap();
    }
    
    @Override
    public UserRole getUserRoleById(Long id) {
        return userDao.getUserRoleById(id);
    }
    
    @Override
    public List<UserRole> getUserRole(){
        return userDao.getUserRole();
    }
    
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
    
    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }
    
    @Override
    public int delUser(Long id) {
        return userDao.delUser(id);
    }
    
}
