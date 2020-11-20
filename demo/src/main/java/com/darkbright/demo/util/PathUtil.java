package com.darkbright.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.net.URL;

@Component
public class PathUtil {
  private static final Logger logger = LoggerFactory.getLogger(PathUtil.class);

  @Autowired
  private ServletContext servletContext;

  /**
   * 例如web路径为: /Users/leo/workspace/demo<br/>
   * servlet context: /Users/leo/workspace/demo<br/>
   * class.getClassLoader().getResource(""): /Users/leo/workspace/demo/WEB-INF/classes/<br/>
   *
   * @param clazz 类
   */
  public void getPath(Class clazz, HttpServletRequest request) {


    //web应用上下文路径,web项目部署的全路径
    logger.info("servlet context: " + servletContext.getRealPath(""));

    //类加载路径,classes目录的全路径,这个方法也可以不在web环境里确定路径,比较好用
    URL classpath = clazz.getClassLoader().getResource("");
    assert classpath != null;
    logger.info("classpath: " + classpath.getPath());

    //获得web根，项目名
    logger.info("contextPath: " + request.getContextPath());


    logger.info(request.getHeader(""));
    logger.info(request.getRequestURI());
    logger.info(request.getServletPath());

    String url = request.getScheme() + "://" + request.getServerName() + request.getRequestURI() + "?" + request.getQueryString();
    System.out.println("获取全路径（协议类型：//域名/项目名/命名空间/action名称?其他参数）url=" + url);
    String url2 = request.getScheme() + "://" + request.getServerName();//+request.getRequestURI();
    System.out.println("协议名：//域名=" + url2);


    System.out.println("获取项目名=" + request.getContextPath());
    System.out.println("获取参数=" + request.getQueryString());
    System.out.println("获取全路径=" + request.getRequestURL());
    request.getSession().getServletContext().getRealPath("/");//获取web项目的路径
    this.getClass().getResource("/").getPath();//获取类的当前目录


  }


}
