package com.darkbright.demo.permission.dao;

import com.darkbright.demo.domain.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
  User get(int id);
}
