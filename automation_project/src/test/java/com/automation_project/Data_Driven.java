package com.automation_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	public static void readData() throws Throwable {
		File file = new File("C:\\Users\\VISHWANATHAN\\eclipse-workspace\\automation_project\\target\\raji.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(1);
		//System.out.println(cell);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}else if (cellType.equals(cellType.NUMERIC)) {
			int numericCellValue =(int)cell.getNumericCellValue();
			
			System.out.println(numericCellValue);
		}
			
		}	
public static void main(String[] args) throws Throwable {

	readData();
	
	
}
}
