package com.darkbright.demo.sequence.importer;

import com.darkbright.demo.domain.entity.Gene;

import java.sql.*;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-03-22 15:21
 **/
public class DBHelper {

  public static Connection getConn() {
    //驱动程序名
    String driver = "com.mysql.cj.jdbc.Driver";
    //URL指向要访问的数据库名
    String url = "jdbc:mysql://47.100.213.205:3306/tcm_holmes";
    //MySQL配置时的用户名
    String user = "its2";
    //MySQL配置时的密码
    String password = "its2tcm";

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

  public static int insert(String tableName, Connection conn, Gene gene) {
    PreparedStatement psql;
    int result = 0;
    //预处理添加数据，其中有两个参数--“？”
    try {
      psql = conn.prepareStatement("insert into " + tableName + " (id, kingdom, phylum, class, `order`, family, genus, species, sequence) "
          + "values(?,?,?,?,?,?,?,?,?)");
      psql.setString(1, gene.getId());
      psql.setString(2, gene.getKingdom());
      psql.setString(3, gene.getPhylum());
      psql.setString(4, gene.getB_class());
      psql.setString(5, gene.getOrder());
      psql.setString(6, gene.getFamily());
      psql.setString(7, gene.getGenus());
      psql.setString(8, gene.getSpecies());
      psql.setString(9, gene.getSequence());

      result = psql.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result;
  }

  public static void select(String tableName) {
    Connection conn = getConn();
    //2.创建statement类对象，用来执行SQL语句！！
    try {

      Statement statement = conn.createStatement();
      //要执行的SQL语句
      String sql = "select * from " + tableName;

      //3.ResultSet类，用来存放获取的结果集！！
      ResultSet rs = statement.executeQuery(sql);

      Gene gene = new Gene();
      while (rs.next()) {
        gene.setId(rs.getString("id"));
        gene.setKingdom(rs.getString("kingdom"));
        gene.setPhylum(rs.getString("phylum"));
        gene.setB_class(rs.getString("class"));
        gene.setOrder(rs.getString("order"));
        gene.setFamily(rs.getString("family"));
        gene.setGenus(rs.getString("genus"));
        gene.setSpecies(rs.getString("species"));
        gene.setSequence(rs.getString("sequence"));

        //输出结果
        System.out.println(gene.toString());
      }

      rs.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
