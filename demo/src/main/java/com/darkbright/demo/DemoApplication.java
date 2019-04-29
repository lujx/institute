package com.darkbright.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ SpringBootApplication注解是Spring Boot的核心注解，它其实是一个组合注解，可点击源码查看，包括如下注解<br/>
 * @ SpringBootConfiguration   表示Application作为配置文件存在<br/>
 * @ EnableAutoConfiguration   表示启用SpringBoot内置的自动配置功能<br/>
 * @ ComponentScan             扫描bean，路径为Application类所在package以及package下的子路径，在spring boot中bean都放置在该路径以及子路径下<br/>
 */
@RestController
@SpringBootApplication
public class DemoApplication {

  @RequestMapping("/")
  String home(){
    return "Hello World!";
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
