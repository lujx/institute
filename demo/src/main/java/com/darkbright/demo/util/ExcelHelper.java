package com.darkbright.demo.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Excel处理器.
 *
 * @author Leo
 * @date 2019-05-05 17:20
 **/
public class ExcelHelper {

  private String FILE_BASE = "d:" + File.separator + "workspaces" + File.separator + "test_zone" + File.separator;

  public void createExcel() {
    try {
      //2007之前的excel
      Workbook wb = new HSSFWorkbook();
      FileOutputStream fileStream = new FileOutputStream(FILE_BASE + "new_excel.xlsx");
      wb.write(fileStream);
      fileStream.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  public void fillExcel(Workbook wb){
  }


}
