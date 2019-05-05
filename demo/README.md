# Spring Boot

##Spring Boot基础配置




##MyBatis整合

* 数据源配置

数据源属性配置都是在spring-boot-autoconfigure包中预先定义好的，只要配置了就会被自动加载并解析。

>其它更多以spring.datasource开头的属性配置可以在spring-boot-autoconfigure包的spring-configuration-metadata.json中查看。

* 数据库连接池配置

Spring Boot默认支持多种数据库连接池技术，例如HikariCP、Tomcat connection pool、Commons DBCP2，Spring Boot使用以下算法来选择特定的连接池:

1. 如果HikariCP是可用的，总是选择它；
2. 否则，如果Tomcat池的数据源可用，就使用它；
3. 如果没有HikariCP或Tomcat池的数据源可用，如果Commons DBCP2可用，就使用它。

如果你使用spring-boot-starter-jdbc或spring-boot-starter-data-jpa，会自动添加对HikariCP的依赖，也就是说此时使用HikariCP。

当然你也可以强制使用其它的连接池技术，可以通过在application.properties或application.yml中配置spring.datasource.type指定。

可以在application.properties或application.yml中配置连接池属性，不同连接池技术的属性配置前缀不同，可以通过使用各自的前缀(spring.datasource.hikari.、spring.datasource.tomcat.、 spring.datasource.dbcp2.*)来微调特定于实现的设置

例如可以在application.properties中配置以下Tomcat连接池属性：

```
spring.datasource.tomcat.max-wait=10000
spring.datasource.tomcat.max-active=50
spring.datasource.tomcat.test-on-borrow=true
```
>更多连接池属性配置可以在spring-boot-autoconfigure包的spring-configuration-metadata.json中查看。

* XML配置方式

* 添加依赖

整合Mybatis需要添加Mybatis框架相关jar，可以使用mybatis-spring-boot-starter
例如使用MySQL数据库，需要添加MySQL依赖jar，具体Maven构建文件如下：

```
<dependencies>
        <!-- web starter entrance -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!-- MyBatis -->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.2</version>
        </dependency>
        <!-- mysql驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
```

* 应用属性配置

在resources目录下新增application.properties，添加数据源和Mybatis属性配置，具体配置如下：

````
#freemarker
spring.freemarker.suffix=.html
#datasource
spring.datasource.url=jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
#mybatis
#MyBatis映射文件的位置
mybatis.mapper-locations=classpath:mapper/*.xml
````


* 注解配置方式



* 事务管理

