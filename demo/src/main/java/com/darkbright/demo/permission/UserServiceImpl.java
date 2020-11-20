package com.darkbright.demo.permission;

import com.darkbright.demo.domain.entity.User;
import com.darkbright.demo.permission.UserService;
import com.darkbright.demo.permission.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-02-18 23:59
 **/
@Service
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  @Override
  public User get(int id) {
    return userRepository.get(id);
    //return new User("bright","1");
  }
}
