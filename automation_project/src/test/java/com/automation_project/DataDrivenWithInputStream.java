package com.automation_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenWithInputStream extends WriteInExcel{
	
public static void main(String[] args) throws Throwable {
	File file = new File("C:\\Users\\VISHWANATHAN\\eclipse-workspace\\automation_project\\target\\raji.xlsx");
	FileInputStream fis = new FileInputStream(file);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheet = wb.createSheet("Raji");
	wb.getSheet("Raji").createRow(0).createCell(0).setCellValue("Username");
	wb.getSheet("Raji").getRow(0).createCell(1).setCellValue("password");
	wb.getSheet("Raji").createRow(1).createCell(0).setCellValue("raji");
	wb.getSheet("Raji").getRow(1).createCell(1).setCellValue(2343);
	wb.getSheet("Raji").createRow(2).createCell(0).setCellValue("vichu");
	wb.getSheet("Raji").getRow(2).createCell(1).setCellValue(3456);
	wb.getSheet("Raji").createRow(3).createCell(0).setCellValue("tharu");
	wb.getSheet("Raji").getRow(3).createCell(1).setCellValue(345);
	FileOutputStream fos = new FileOutputStream(file);
	wb.getSheet("userdata2").createRow(2).createCell(0).setCellValue("raji");
	wb.getSheet("userdata2").getRow(2).createCell(1).setCellValue(12345);
	wb.write(fos);
	wb.close();
	
			
			
}
}
