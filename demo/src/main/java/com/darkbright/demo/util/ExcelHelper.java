package com.darkbright.demo.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;

/**
 * Excel处理器.<br/>
 * HSSFWorkbook:是操作Excel2003以前（包括2003）的版本，扩展名是.xls，一张表最大支持65536行数据，256列，也就是说一个sheet页，最多导出6w多条数据<br/>
 * <p>
 * XSSFWorkbook:是操作Excel2007-2010的版本，扩展名是.xlsx，一张表最大支持1,048,576行，16,384列<br/>
 * <p>
 * SXSSF是对XSSF的一种流式扩展，特点是采用了滑动窗口的机制，低内存占用，主要用于数据量非常大的电子表格而虚拟机堆有限的情况。<br/>
 *
 * @author Leo
 * @date 2019-05-05 17:20
 **/
public class ExcelHelper {

  private String FILE_BASE = "d:" + File.separator + "workspaces" + File.separator + "test_zone" + File.separator;

  //region 创建Excel

  /**
   * 创建excel文档
   *
   * @param workbook excel
   * @param fileName 文件名
   */
  public void createExcel(Workbook workbook, String fileName) {
    try {
      FileOutputStream fileStream = new FileOutputStream(FILE_BASE + fileName);
      workbook.write(fileStream);
      fileStream.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * 填充excel
   */
  public void fillExcel(Workbook workbook) {
    XSSFSheet sheet = (XSSFSheet) workbook.createSheet("sheet");
    //第0行，创建表头
    XSSFRow header = sheet.createRow(0);

    //填充表头字段
    header.createCell(0).setCellValue("学号");
    header.createCell(1).setCellValue("姓名");
    header.createCell(2).setCellValue("专业");
    header.createCell(3).setCellValue("班级");
    header.createCell(4).setCellValue("身份证号");
    header.createCell(5).setCellValue("宿舍号");
    header.createCell(6).setCellValue("报道日期");

    formatColumn(sheet, header);

  }

  /**
   * 设置表头列宽
   *
   * @param sheet  操作的sheet
   * @param header 表头
   */
  public void formatColumn(XSSFSheet sheet, XSSFRow header) {
    //getPhysicalNumberOfCells()代表这行有多少包含数据的列
    for (int i = 0; i < header.getPhysicalNumberOfCells(); i++) {
      // POI设置列宽度时比较特殊，它的基本单位是1/255个字符大小，
      // 因此我们要想让列能够盛的下20个字符的话，就需要用255*20
      sheet.setColumnWidth(i, 255 * 20);
    }
    //设置表头高度
    header.setHeightInPoints(30);
  }

  public CellStyle formatCellStyle(CellStyle cellStyle) {
    //水平居中
    cellStyle.setAlignment(HorizontalAlignment.CENTER);
    //垂直居中
    cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);

    return cellStyle;
  }

  //endregion


  //region 读取Excel

  public void readExcel(String filename){
    try {
      //读取文件流
      InputStream in = new FileInputStream(filename);
      //把文件流转换成POI文件系统
      POIFSFileSystem fs = new POIFSFileSystem(in);
      XSSFWorkbook workbook = new XSSFWorkbook(fs);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }



  //endregion

  /**
   * 1.创建工作簿Workbook
   * 2.创建Sheet
   * 3.创建行Row
   * 4.创建单元格Cell
   */
  public void createHandler(){
    ExcelHelper excelHelper = new ExcelHelper();

    String fileName = "new_excel.xlsx";

    //2007之前的excel,如果非要改成后缀是xlsx，文件无法打开
    Workbook xlsWorkbook = new HSSFWorkbook();

    //2007之后的excel
    Workbook xlsxWorkbook = new XSSFWorkbook();

    //POI还有SXSSFWorkbook专门处理大数据,通过限制滑动窗口来

    excelHelper.fillExcel(xlsxWorkbook);
    excelHelper.createExcel(xlsxWorkbook, fileName);
  }

  public void readHandler(){

  }


  public static void main(String[] args) {
    ExcelHelper excelHelper = new ExcelHelper();
    //excelHelper.createHandler();


  }

}