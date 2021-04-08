package com.automation_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {
	public static void writeData() throws Throwable {
		File file = new File("C:\\Users\\VISHWANATHAN\\eclipse-workspace\\automation_project\\target\\raji.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		
		Workbook w =new XSSFWorkbook();
		
		Sheet sheet = w.createSheet("userData1");
		sheet.createRow(0).createCell(0).setCellValue("username");
		sheet.getRow(0).createCell(1).setCellValue("password");
		sheet.createRow(1).createCell(0).setCellValue("vichu");
		sheet.getRow(1).createCell(1).setCellValue(123);
		Sheet sheet1 = w.createSheet("userData2");
		sheet1.createRow(0).createCell(0).setCellValue("username");
		sheet1.getRow(0).createCell(1).setCellValue("password");
		sheet1.createRow(1).createCell(0).setCellValue("raji");
		sheet1.getRow(1).createCell(1).setCellValue(987);
        w.write(fos);
        w.close();
	}
	
public static void main(String[] args) throws Throwable {
	writeData();
}
}
