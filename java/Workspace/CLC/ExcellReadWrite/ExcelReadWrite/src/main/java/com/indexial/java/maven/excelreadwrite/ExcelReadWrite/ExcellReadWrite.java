package com.indexial.java.maven.excelreadwrite.ExcelReadWrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReadWrite {
	
	public static final String FILE_NAME="C:\\Users\\Dinesh\\Desktop\\FilesJava\\Emp.xlsx";
	
	public static void writeExcelSheet(Set<Employee> setOfEmp) throws IOException {
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("EmployeeDetails");
		XSSFRow row=sheet.createRow(0);
		
		XSSFCell cellid=row.createCell(0);
		XSSFCell cellname=row.createCell(1);
		XSSFCell cellage=row.createCell(2);
		XSSFCell celladd=row.createCell(3);

		cellid.setCellType(CellType.STRING);
		cellname.setCellType(CellType.STRING);
		cellage.setCellType(CellType.STRING);
		celladd.setCellType(CellType.STRING);
		
		cellid.setCellValue("EmpID");
		cellname.setCellValue("EmpName");
		cellage.setCellValue("EmpAge");
		celladd.setCellValue("EmpAddress");
		
		
		int rowCount =1;
		for(Employee emp :setOfEmp ){
			row = sheet.createRow(rowCount);

			cellid = row.createCell(0);
			cellname =row.createCell(1);
			cellage =row.createCell(2);
			celladd =row.createCell(3);
			
			cellid.setCellType(CellType.NUMERIC);
			cellname.setCellType(CellType.NUMERIC);
			cellage.setCellType(CellType.STRING);
			celladd.setCellType(CellType.STRING);
			
			cellid.setCellValue(emp.getEmpId());
			cellname.setCellValue(emp.getEmpName());
			cellage.setCellValue(emp.getEmpAge());
			celladd.setCellValue(emp.getEmpAddress());
			rowCount++;
		}
		
		FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
		workbook.write(outputStream);
		workbook.close();
		
		System.out.println("Employye Details Written into an Excell File");
	}
}
