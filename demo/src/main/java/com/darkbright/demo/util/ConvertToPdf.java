package com.darkbright.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.regex.Pattern;

//import org.artofsolving.jodconverter.OfficeDocumentConverter;
//import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
//import org.artofsolving.jodconverter.office.OfficeManager;

/**
 * Word文档转换为PDF文档
 * 可以在Linux下转换，转换质量不够好，表格类偶尔转换格式不正确
 */
public class ConvertToPdf {
	
	private static Logger logger = LoggerFactory.getLogger(ConvertToPdf.class);

	//private static OfficeManager officeManager;
	//private static String OPEN_OFFICE_HOME = FileUtil.getFilePath("open_office_home");
	private static int OPEN_OFFICE_PORT[] = { Integer.parseInt("8100") };

	/**
	 * 将Office文档转换为PDF. 运行该函数需要用到OpenOffice, OpenOffice
	 * 源文件,绝对路径. 可以是Office2003-2007全部格式的文档, Office2010的没测试. 包括.doc,
	 * .docx, .xls, .xlsx, .ppt, .pptx等.
	 * 目标文件.绝对路径.
	 * @param inputFilePath
	 */
	public static File word2pdf(String inputFilePath) {
		
		/*//把输入的word路径，后缀替换为pdf.
		String pdfPath = inputFilePath.substring(0, inputFilePath.lastIndexOf(".") + 1)+"pdf";
		logger.debug("pdfPath为" + pdfPath);
		//启动openoffice服务
		startService();
		OfficeDocumentConverter converter = new OfficeDocumentConverter(officeManager);
		logger.debug("converter对象为：" + converter);
		
		File inputFile = new File(inputFilePath);
		File outputFile = new File(pdfPath);
		logger.debug("inputFile名称为：" + inputFile.getName());
		if (inputFile.exists()) {// 找不到源文件, 则返回
			
			//假如目标路径不存在,则新建该路径
			if (!outputFile.getParentFile().exists()) {
				outputFile.getParentFile().mkdirs();
			}
			converter.convert(inputFile, outputFile);
		}
		
		//关闭openoffice服务
		stopService();
		logger.debug("转换为PDF输出：" + outputFile);
		return outputFile;*/
		return null;
	}

	/**
	 * 根据操作系统获取openoffice安装地址
	 * @return office_home
	 */
	public static String getOfficeHome() {
		
		String osName = System.getProperty("os.name");
		
		if (Pattern.matches("Linux.*", osName)) {
			return "/opt/openoffice4";
		} else if (Pattern.matches("Windows.*", osName)) {
			return "D:/Program Files/OpenOffice4";
		}
		return null;
	}

	/**
	 * 启动openoffice服务
	 */
	public static void startService() {
		/*
		DefaultOfficeManagerConfiguration configuration = new DefaultOfficeManagerConfiguration();
		
		try {
			
			logger.debug("准备启动服务....");
			configuration.setOfficeHome(getOfficeHome());//设置OpenOffice.org安装目录
			configuration.setPortNumbers(OPEN_OFFICE_PORT); //设置转换端口，默认为8100
			configuration.setTaskExecutionTimeout(1000 * 60 * 5L);//设置任务执行超时为5分钟
			configuration.setTaskQueueTimeout(1000 * 60 * 60 * 24L);//设置任务队列超时为24小时

			officeManager = configuration.buildOfficeManager();
			officeManager.start();// 启动服务
			logger.debug("office转换服务启动成功!");
		} catch (Exception ce) {
			logger.debug("office转换服务启动失败!详细信息:" + ce);
		}*/
	}

	/**
	 * 关闭openoffice服务
	 */
	public static void stopService() {
		/*logger.debug("关闭office转换服务....");
		if (officeManager != null) {
			officeManager.stop();
		}
		logger.debug("关闭office转换成功!");*/
	}
}