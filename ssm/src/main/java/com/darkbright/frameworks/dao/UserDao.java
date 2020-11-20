package com.darkbright.frameworks.dao;

import com.darkbright.frameworks.domain.dto.UserDetail;
import com.darkbright.frameworks.domain.dto.UserRole;
import com.darkbright.frameworks.domain.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 这里的@MapperScan就是Mapper扫描器中所需要的配置，会自动生成代理对象。
 * 注意，接口中的方法名称要和对应的MyBatis映射文件中的语句的id值一样，
 * 因为生成的动态代理，会根据这个匹配相应的Sql语句执行。
 * 另外就是方法的参数和返回值也需要注意。
 * 接口中的方法如何定义，对应的MyBatis映射文件就应该进行相应的定义。
 * 最后，标注中的userDao是用来作为Spring的Bean的id(或name)进行使用的，方便我们在Service层进行注入使用。
 * <p>
 * Created by bright on 2018/1/7.
 *
 * @author bright
 */
@Repository
public interface UserDao {
    /*
     * 此处的方法名必须和mapper中的映射文件中的id属性同名
     * 回去映射文件中通过com.darkbright.frameworks.dao.UserDao.getUser,即this.getClass().getName()+".getUser"
     */
    
    /**
     * 获取用户名
     *
     * @param uid 用户id
     * @return User
     */
    User getUser(Long uid);
    
    /**
     * 获取所有的用户
     *
     * @return user list.
     */
    List<User> getUsers();
    
    /**
     * 获取用户详细信息
     *
     * @return
     */
    List<UserDetail> getUserDetail();
    
    /**
     * 获取用户详细信息
     *
     * @return
     */
    List<UserDetail> getUserDetailByResultMap();
    
    /**
     * 获取单个用户的信息和角色列表
     */
    UserRole getUserRoleById(Long id);
    
    /**
     * 获取用户的信息和角色列表
     */
    List<UserRole> getUserRole();
    
    /**
     * 插入用户对象
     *
     * @return int
     */
    int addUser(User user);
    
    /**
     * 更新用户
     *
     * @param user 要修改的用户
     * @return 响应值（1成功，0失败）
     */
    int updateUser(User user);
    
    /**
     * 删除用户
     *
     * @param id 用户id
     * @return 响应值（1成功，0失败）
     */
    int delUser(Long id);
    
    
}
