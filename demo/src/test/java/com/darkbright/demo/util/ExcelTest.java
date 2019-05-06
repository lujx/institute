package com.darkbright.demo.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * description here.
 *
 * @author Leo
 * @date 2019-05-05 18:07
 **/
public class ExcelTest {


  public static void main(String[] args) {
    ExcelHelper excelHelper = new ExcelHelper();
    String fileName = "new_excel.xlsx";

    //2007之前的excel
    Workbook wb = new HSSFWorkbook();

    excelHelper.createExcel(wb, fileName);

  }

}
