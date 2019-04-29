package com.darkbright.demo.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ ConfigurationProperties 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 *
 * @author Leo
 * @date 2019-01-28 11:49
 **/
@Component
@ConfigurationProperties(prefix = "person")
public class YmlTry {
}
