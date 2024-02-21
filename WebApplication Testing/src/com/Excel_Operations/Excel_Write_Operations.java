package com.Excel_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Operations {
public static void main(String[] args) throws IOException {
	//identify the file in the system
	FileInputStream  testDatafile= new FileInputStream("./src/com/Excelsheets/pardhu1.xlsx");
	//identifying the workbook in the file
	XSSFWorkbook workbook = new XSSFWorkbook(testDatafile);
	//identifying the sheet in the workbook
	XSSFSheet  testdatasheet=workbook.getSheet("Sheet1");
	//Create a particular row in the sheet
	Row rowdata=testdatasheet.createRow(4);
  Cell	celldata=rowdata.createCell(4);
  // sending data into new row of cell created
  celldata.setCellValue("selenium");
  //The excels file along with the workbook should be saved
  FileOutputStream testdataresultfile= new FileOutputStream("./src/com/Excel_Output_Results/paardhu2.xlsx");
  workbook.write(testdataresultfile);
	
	
} 
}
