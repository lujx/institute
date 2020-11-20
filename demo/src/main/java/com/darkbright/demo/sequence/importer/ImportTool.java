package com.darkbright.demo.sequence.importer;

import com.darkbright.demo.domain.entity.Gene;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-04-26 13:10
 **/
public class ImportTool {
  private static FileHandler fileHandler = new FileHandler();

  private static String DATABASE="trnl";

  private static String[] readFile() {
    String fileName = "id_zhushi_xulie."+DATABASE;
    String readPath = "D:" + File.separator + fileName + ".txt";
    //String writePath = "D:" + File.separator + fileName + ".sql";


    try {
      //读取文件内容
      String fileContext = fileHandler.readFile(readPath);

      //Windows下处理换行符
      fileContext = fileContext.replace("\r", "");

      return fileContext.split("\n");
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }


  public static void main(String[] args) throws SQLException {
    Gene gene = new Gene();
    String[] fileRows = readFile();
    int result = 0;
    Connection conn = DbHelper.getConn();

    for (int i = 1; i < fileRows.length; i++) {
      if (i % 3 == 0) {
        //拼接语句
        fileHandler.spliceGene(fileRows, i, gene);
        int flag = DbHelper.insert(DATABASE, conn, gene);
        if (flag == 1) {
          System.out.println("插入成功:" + ++result);
        }
      }
    }
    System.out.println("影响行数：" + result);
    conn.close();
  }
}
