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

public class All_DataInDDriven {
	public static void allData() throws Throwable {
		File file = new File("C:\\Users\\VISHWANATHAN\\eclipse-workspace\\automation_project\\target\\raji.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			System.out.println();
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue+"  ");
				}else if (cellType.equals(cellType.NUMERIC)) {
					int numericCellValue =(int)cell.getNumericCellValue();
					
					System.out.print(numericCellValue+"  ");
				}
				
			}
		}
		
	}
public static void main(String[] args) throws Throwable {
	allData();
}
}
