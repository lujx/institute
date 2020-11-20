package com.darkbright.frameworks.controller.learn;

import com.darkbright.frameworks.domain.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * <hr/>
 * <p>
 * </p>
 */
//注册一个bean到spring上下文中
@Controller
//注解为控制器指定可以处理哪些 URL 请求
@RequestMapping("/springMvc")
public class SpringMvcController {
    
    private static Logger logger = LoggerFactory.getLogger(SpringMvcController.class);
    
    /**
     * 页面入口
     * <p>
     * RequestMapping: 如果没有配置method，接口会响应所有的请求
     *
     * @return springMVC入口页面
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String springMvcEnter() {
        return "/learn/springMvc";
    }
    
    
    //region 接收参数
    /*========================================================
        1. 前端传递过来的参数与http请求的参数名称一致;
        2. 前端传递过来的参数名与类的属性名一致，springMVC会自动转换为对象;
        
        
        注意：1.若参数可为空，则初始化为null，所以参数设定为基础类型的话就会报错；
        
        
     ========================================================*/
    
    /**
     * ==============1、接收普通请求参数================
     * <br/>  无需注解也可以进行参数传递，注意以下：
     * <br/>     · 前端传递过来的参数与http请求的参数名称一致
     * <br/>     · 参数默认可为空；
     * <br/>     · 与顺序无关
     * <br/>     · 对象参数可以和普通参数同时接收传递
     * <br/>     · 如果参数同名字的话：
     * <br/>         字符串结果就用逗号分隔（例如前端传递了两个同为param1的参数，值分别为a和b，后台接受到的结果就是[a,b]的字符串）;
     * <br/>         整型结果用第一个整数结果.
     *
     * @param user   用户
     * @param param1 参数1，String
     * @param param2 参数2，Integer
     * @return 跳转接口
     */
    @GetMapping("/receive-normal")
    public String paramsNormal(User user, String param1, Integer param2) {
        logger.info("User Name => " + user.getNickname());
        logger.info("User password => " + user.getPasswd());
        logger.info("Param1 => " + param1);
        logger.info("Param2 => " + param2);
        return "redirect:/springMvc";
    }
    
    /**
     * <br/>通过Servlet提供的API来接受参数，例如Application、session、request
     * <br/> * 不建议使用，因为这和Servlet容器耦合紧密，spring提供了其他方式获取其参数
     *
     * @param session Servlet的session API
     * @param request Servlet的request API
     * @return 跳转接口
     */
    @GetMapping("/receive-servlet")
    public String paramsWithServlet(HttpSession session, HttpServletRequest request) {
        logger.info("Request : " + request);
        logger.info("Request : " + request.getParameter("param2"));
        logger.info("Session : " + session.toString());
        logger.info("Session : " + session.getAttribute("user"));
        return "redirect:/springMvc";
    }
    
    /**
     * ================2.接收注解参数请求 ====================
     * <br/> 1.@RequestParam注解
     * <br/>   · 可以设定与前端传递来的参数名不一致
     * <br/>
     * <br/> 2.@PathVariable注解
     * <br/>   · 连接在URL地址内
     * <br/>
     * <br/> 3.@RequestBody注解
     * <br/>
     * <br/>
     * <br/>
     * <br/>
     * <br/>
     *
     * @param requestParam1 URI路径参数
     * @param requestParam2 request参数，String
     * @param pathParam   request参数，Integer
     * @param requestUser 用户对象
     * @return 跳转接口
     */
    @GetMapping("/receive-annotation/{pathParam}")
    public String paramsWithAnnotation(@RequestParam(value = "param1") String requestParam1,
                                       @RequestParam(value = "param2", required = false) int requestParam2,
                                       @PathVariable(value = "pathParam") String pathParam,
                                       @RequestBody User requestUser,
                                       @SessionAttribute("user") User SessionUser
                                       ) {
        logger.info("User Name is : " + requestUser.getNickname());
        logger.info("User password is : " + requestUser.getPasswd());
        logger.info("RequestParam1 : " + requestParam1);
        logger.info("RequestParam2 : " + requestParam2);
        logger.info("PathParam : " + pathParam);
        return "redirect:/springMvc";
    }
    //endregion
    
    //region 返回参数
    
    /*=================springMVC返回数据的方式==============
    
    
    
    
        知识点：ModelAndView 表示同时持有Model和View。Model和View是完全不同的。
                返回的类型可以是很多种，ModelAndView、String、View，还有很多。
                但是他们最终会被解析为 ModelAndView 类型的对象。
    =====================================================*/
    
    /**
     * 返回ModelAndView，逻辑视图地址，框架会自动补充前缀和后缀
     */
    @GetMapping("/return-mav")
    public ModelAndView springReturnMav() {
        ModelAndView mav = new ModelAndView("learn/springMvc");
        mav.addObject("mavVal", "mav-value");
        return mav;
    }
    
    /**
     * 返回值是void：
     * 1.可以使用request跳转页面，并通过setAttribute方式返回参数<br/>
     */
    @GetMapping("/return-void-request")
    public void returnVoidByRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 向页面传递参数
        request.setAttribute("voidVal", "void-value");
        // 如果使用原始的方式做页面跳转，必须给的是jsp的完整路径
        request.getRequestDispatcher("/WEB-INF/view/learn/springMvc.jsp").forward(request, response);
    }
    
    /**
     * 返回值是void：
     * 2.也可以通过response实现页面重定向<br/>
     */
    @GetMapping("/return-void-response")
    public void returnVoidByResponse(HttpServletResponse response) throws Exception {
        //通过response指定响应结果，例如响应json数据
        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        writer.write("{\"id\":\"123\"}");
        //通过response实现页面重定向
        response.sendRedirect("/WEB-INF/view/learn/springMvc.jsp");
    }
    
    
    /**
     * 返回值是字符串：
     * 1.返回逻辑视图名，通过视图解析，框架会自动补充前缀和后缀
     *
     * @return 逻辑视图名
     */
    @GetMapping("/return-str-viewname")
    public String returnStringByViewName(Model model) {
        //通过Model对象来返回数据
        model.addAttribute("modelVal", "model-value-viewname");
        //可以指定逻辑视图名，通过视图解析器解析为物理视图地址,"WEB-INF/view/learn/springMvc.jsp"
        return "learn/springMvc";
    }
    
    /**
     * 返回值是字符串：
     * 2.返回Redirect重定向
     *
     * @return Redirect重定向，到接口名
     */
    @GetMapping("/return-str-redirect")
    public String returnStringByRedirect(Model model) {
        //通过Model对象来返回数据
        model.addAttribute("modelVal", "model-value-redirect");
        // '/'是不包含工程名的根目录，即http://localhost:8008/learn/springMvc
        //redirect方式相当于“response.sendRedirect()”，转发后浏览器的地址栏变为转发后的地址，因为转发即执行了一个新的request和response。由于新发起一个request，原来的参数在转发时就不能传递到下一个url，如果要传参数可以在/springMvc/return-mav后边加参数，如下：
        //
        //return "redirect:/springMvc/return-mav?id=xxx&name=xxx";
        return "redirect:return-mav";
    }
    //endregion
    
    
}
