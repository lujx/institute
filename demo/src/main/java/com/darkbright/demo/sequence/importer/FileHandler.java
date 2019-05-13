package com.darkbright.demo.sequence.importer;

import com.darkbright.demo.domain.entity.Gene;

import java.io.*;

/**
 * @author Leo
 * @date 2019-03-22 00:07
 **/
public class FileHandler {

  private static final String TABLE_NAME = "trnl";
  /**
   * Taxonomy分类位置, 0:domain; 1:kingdom; 2:phylum; 10:class; 13:order; 15:family; 23:genus; 24:species
   * <p>
   * genus:18
   */
  private static final int[] INDEXES = {0, 1, 2, 10, 13, 15, 23, 24};

  /**
   * 读取文件
   *
   * @param path 待读取文件路径
   * @return 文件内容
   */
  public String readFile(String path) throws IOException {

    //1. 使用File类打开一个文件
    File file = new File(path);
    if (!file.exists()) {
      System.out.println("File not exist.");
    }

    //2. 通过字节流或字符流的子类，指定输出的位置
    InputStream in = new FileInputStream(file);
    byte[] bs = new byte[(int) file.length()];

    //3. 进行读/写操作
    in.read(bs);

    //4. 关闭输入/输出.
    in.close();

    return new String(bs);
  }

  /**
   * 写入文件
   *
   * @param path    待写入文件路径
   * @param context 文件内容
   */
  public void writeFile(String path, String context) throws IOException {
    File file = new File(path);
    if (!file.exists()) {
      System.out.println("File not exist.");
      file.createNewFile();
      System.out.println("Create a new file.");
    }
    OutputStream outputStream = new FileOutputStream(file);
    outputStream.write(context.getBytes());
    outputStream.close();
  }

  /**
   * 拼接sql语句
   *
   * @param fileRows 文件内容按行划分数组
   * @return sql语句
   */
  public String spliceStatement(String[] fileRows) {
    StringBuilder sb = new StringBuilder();
    sb.append("insert into ");
    sb.append(TABLE_NAME);
    sb.append("(id, taxonomy, seq) values");
    for (int i = 1; i < fileRows.length; i++) {
      if (i % 3 == 0) {
        sb.append("('");
        //id
        sb.append(fileRows[i - 3]);
        sb.append("','");
        //taxonomy
        sb.append(handleTaxonomy(fileRows[i - 2]));
        sb.append("','");
        //sequence
        sb.append(fileRows[i - 1]);
        sb.append("'),");
      }
    }

    String statement = sb.toString();
    //去掉末尾的“,”
    int index = statement.lastIndexOf(",");
    statement = statement.substring(0, index);
    statement = statement + ";";
    return statement;
  }

  /**
   * 填充Gene
   *
   * @param fileRows 文件逐行数组
   * @param gene     gene
   */
  public void spliceGene(String[] fileRows, int i, Gene gene) {
    gene.setId(fileRows[i - 3]);

    splitTaxonomy(fileRows[i - 2], gene);

    gene.setSequence(fileRows[i - 1]);
  }


  /**
   * 处理Taxonomy
   *
   * @param origin 原始taxonomy字符串
   * @return
   */
  public String handleTaxonomy(String origin) {
    origin = origin.replace("\'", "\\'");
    //把25个taxonomy分开
    String[] singleTaxonomy = origin.split("_");
    StringBuilder taxonomy = new StringBuilder();


    for (int i = 0; i < INDEXES.length; i++) {
      taxonomy.append(singleTaxonomy[INDEXES[i]]);
      if (i != INDEXES.length - 1) {
        taxonomy.append("_");
      }
    }
    return taxonomy.toString();
  }


  private void splitTaxonomy(String origin, Gene gene) {
    origin = origin.replace("\'", "\\'");
    //把25个taxonomy分开
    String[] singleTaxonomy = origin.split("_");
    gene.setDomain(singleTaxonomy[INDEXES[0]]);
    gene.setKingdom(singleTaxonomy[INDEXES[1]]);
    gene.setPhylum(singleTaxonomy[INDEXES[2]]);
    gene.setB_class(singleTaxonomy[INDEXES[3]]);
    gene.setOrder(singleTaxonomy[INDEXES[4]]);
    gene.setFamily(singleTaxonomy[INDEXES[5]]);
    gene.setGenus(singleTaxonomy[INDEXES[6]]);
    gene.setSpecies(singleTaxonomy[INDEXES[7]]);
  }
}
