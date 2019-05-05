package com.darkbright.demo.permission.dao;

import com.darkbright.demo.domain.entity.User;


/**
 '@Mapper' 是mybatis注解，mybatis运行时需要能找到mapper文件，然后运行时构建代理类来完成功能，和Spring没有关系。
 应该用@MapperScan来扫描mapper接口，让mybatis能找到这些接口。
 然后Spring的@ComponetScan也要扫描这些接口，这样Spring才能管理这些mybatis生成的代理类。
 '@Repository' 是Spring的注解，而且注解放在接口上也没用也没有意义
 */
public interface UserRepository {
  User get(int id);
}
