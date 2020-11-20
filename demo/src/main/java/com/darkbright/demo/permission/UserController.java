package com.darkbright.demo.permission;

import com.darkbright.demo.core.filter.Filtering;
import com.darkbright.demo.domain.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ SessionAttributes作用于Controller类上，用于在多个请求之间传递参数，类似于Session的Attribute，但不完全一样，<br/> 一般来说@SessionAttributes设置的参数只用于暂时的传递，而不是长期的保存，长期保存的数据还是要放到Session中。<br/>
 * <br/>
 * 通过@SessionAttributes注解设置的参数有3类用法：<br/>
 * （1）在视图中通过request.getAttribute或session.getAttribute获取<br/>
 * （2）在后面请求返回的视图中通过session.getAttribute或者从model中获取<br/>
 * （3）自动将参数设置到后面请求所对应处理器的Model类型参数或者有@ModelAttribute注释的参数里面。<br/>
 * <br/>
 * 将一个参数设置到SessionAttributes中需要满足两个条件：<br/>
 * （1）在@SessionAttributes注解中设置了参数的名字或者类型<br/>
 * （2）在处理器中将参数设置到了model中。<br/>
 *
 * @author leo
 */
@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
  private static Logger logger = LoggerFactory.getLogger(UserController.class);

  /*private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }*/

  /**
   * 1、功能描述：从路径中获取参数
   *
   * @param userId 用户ID
   * @return user
   */
  @GetMapping("/{userId}")
  User get(@PathVariable() int userId) {
    User user = new User("bright", "xxx");
    System.out.println("arrived.");
    //User user = userService.get(userId);
    user.setId(userId);
    return user;
  }

  /**
   * 2、功能描述：从参数表获取参数
   *
   * @param index 起始页
   * @param size  每页大小
   * @return 用户列表
   */
  @GetMapping()
  List<User> list(@RequestParam(value = "index", required = false, defaultValue = "0") int index,
                  @RequestParam(value = "size", required = false, defaultValue = "10") int size) {
    List<User> users = new ArrayList<>();
    users.add(new User("bright", "xxx"));
    users.add(new User("leopold", "xxx"));
    return users;
  }


  /**
   * 3、功能描述：bean对象传参<br/>
   * 注意：<br/>
   * · 注意需要指定http头为 content-type为application/json<br/>
   * · 使用body传输数据<br/>
   *
   * @param user      user对象
   * @param filtering 查询参数
   * @return 当前user
   */
  @GetMapping("/current")
  public User getByUser(User user, Filtering filtering) {
    logger.info(filtering.toString());
    return user;
  }

  /**
   * 4、从请求头中获取
   *
   * @param user        user对象
   * @param accessToken header参数
   * @return 当前user
   */
  @GetMapping("/current-by-header")
  public User getByHeader(User user, @RequestHeader("access-token") String accessToken) {
    logger.info(accessToken);
    return user;
  }

  //region 5、从session中获取结果.

  /**
   *
   */
  @GetMapping("/set-session")
  public String getBySession(Model model) {
    model.addAttribute("user", new User("session_user", "xxx"));

    return "/users/return-session";
  }

  /**
   * @param user user对象
   * @return 会话中的user
   */
  @GetMapping("return-session")
  public User returnByGetSession(@SessionAttribute User user) {
    return user;
  }

  //endregion
}
