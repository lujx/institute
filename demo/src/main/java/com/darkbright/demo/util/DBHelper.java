package com.darkbright.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-03-22 15:21
 **/
public class DBHelper {

  //驱动程序名
  private static String driver = "com.mysql.cj.jdbc.Driver";
  //URL指向要访问的数据库名
  private static String url = "jdbc:mysql://47.100.213.205:3306/tcm_holmes";
  //MySQL配置时的用户名
  private static String user = "its2";
  //MySQL配置时的密码
  private static String password = "its2tcm";

  public static Connection getConn() {

    Connection conn = null;
    //加载驱动程序
    try {
      Class.forName(driver);

      //1.getConnection()方法，连接MySQL数据库！！
      conn = DriverManager.getConnection(url, user, password);
      if (!conn.isClosed())
        System.out.println("Succeeded connecting to the Database!");

    } catch (SQLException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      //数据库驱动类异常处理
      System.out.println("Sorry, can`t find the Driver!");
      e.printStackTrace();
    }
    return conn;
  }

}
