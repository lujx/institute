package com.darkbright.frameworks.controller;

import com.darkbright.frameworks.domain.dto.UserRole;
import com.darkbright.frameworks.domain.entity.User;
import com.darkbright.frameworks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by bright on 2017/12/20.
 *
 * @author bright
 */
@Controller
@RequestMapping(value = "/users")
public class UserController {
    private UserService userService;
    
    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping(value = "/{id}", method = {RequestMethod.GET})
    public ModelAndView getUser(@PathVariable("id") Long userId) {
        ModelAndView mav = new ModelAndView("user_list");
        User user = userService.getUser(userId);
        mav.addObject("user", user);
        return mav;
    }
    
    @RequestMapping(method = {RequestMethod.GET})
    public ModelAndView listUser() {
        ModelAndView mav = new ModelAndView("user_list");
        List<User> users = userService.getUsers();
        
        List<UserRole> userRoles =userService.getUserRole();
        
        mav.addObject("users", users);
        return mav;
    }
    
    
    @ResponseBody
    @RequestMapping(value = "/{user_id}/roles", method = {RequestMethod.GET})
    public UserRole getUserRole(@PathVariable("user_id") Long userId) {
        return userService.getUserRoleById(userId);
    }
    
    @ResponseBody
    @RequestMapping(value = "/userrole", method = {RequestMethod.GET})
    public List<UserRole> getUserRoleList() {
        return userService.getUserRole();
    }
    
    /**
     * 增加一个用户
     *
     * @param nickname     用户名
     * @param userPassword 用户密码
     * @return 重定向地址
     */
    @RequestMapping(method = {RequestMethod.POST})
    public String addUser(@RequestParam("name") String nickname, @RequestParam("password") String userPassword) {
        User user = new User();
        user.setNickname(nickname);
        user.setPasswd(userPassword);
        userService.addUser(user);
        return "redirect: /users";
    }
    
    /**
     * 删除一个用户
     *
     * @param userId 用户id
     * @return 重定向地址
     */
    @RequestMapping(value = "/{id}", method = {RequestMethod.DELETE})
    public String delUser(@PathVariable("id") Long userId) {
        userService.delUser(userId);
        return "redirect: /users";
    }
    
    /**
     * 整体修改一个用户
     *
     * @return 重定向地址
     */
    @RequestMapping(value = "/{id}", method = {RequestMethod.PUT})
    public String updateUser(@PathVariable("id") Long userid, @RequestParam("nickname") String nickname, @RequestParam("password") String userPassword) {
        
        User user = new User();
        user.setId(userid);
        user.setNickname(nickname);
        user.setPasswd(userPassword);
        userService.updateUser(user);
        
        return "redirect: /users";
    }
}
