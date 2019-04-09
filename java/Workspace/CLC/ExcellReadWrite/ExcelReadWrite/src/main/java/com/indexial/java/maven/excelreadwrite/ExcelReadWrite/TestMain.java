package com.indexial.java.maven.excelreadwrite.ExcelReadWrite;

import java.io.IOException;
import java.util.LinkedHashSet;

public class TestMain {

	public static void main(String[] args) throws IOException {
		Employee emp1 = new Employee(1, "Dinesh", 24, "Pune1");
		Employee emp2 = new Employee(2, "Ganesh", 25, "Pune2");
		Employee emp3 = new Employee(3, "Ramesh", 26, "Pune3");
		Employee emp4 = new Employee(4, "Somesh", 27, "Pune4");
		Employee emp5 = new Employee(5, "Rajesh", 28, "Pune5");
		
		LinkedHashSet<Employee> setOfEmp= new LinkedHashSet<Employee>();
		
		setOfEmp.add(emp1);
		setOfEmp.add(emp2);
		setOfEmp.add(emp3);
		setOfEmp.add(emp4);
		setOfEmp.add(emp5);
		
		ExcellReadWrite.writeExcelSheet(setOfEmp);
		
		System.out.println("Excellll Created");
		
	}	

}
