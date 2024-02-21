package com.Excel_Operations;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {
	public static void main(String[] args) throws IOException {
		
	
	//Identify the file in the system
	FileInputStream testdatafile = new FileInputStream("./src/com/Excelsheets/pardhu1.xlsx");
	//Identify the workboook in the file
	XSSFWorkbook work_book = new XSSFWorkbook(testdatafile);
	//Iedntify the sheet in the workbook
 XSSFSheet 	Excelsheetdata= work_book.getSheet("Sheet1");
 //identify the row in the sheet
 
Row rowdata=Excelsheetdata.getRow(1);
//identify the cell in row
Cell celldata=rowdata.getCell(2);
String celldataFile=celldata.getStringCellValue();

System.out.println(celldataFile);
	
	}
	

}
