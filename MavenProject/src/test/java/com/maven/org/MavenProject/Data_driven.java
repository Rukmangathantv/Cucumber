package com.maven.org.MavenProject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Data_driven {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\MavenProject\\target\\mavenXL.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		for(int i =0; i < s.getPhysicalNumberOfRows();i++) {
			Row row =s.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell column = row.getCell(j);
				CellType ct = column.getCellType();
				if(ct.equals(CellType.STRING)) {
					System.out.println(column.getStringCellValue());
				}
				else {
					double value = column.getNumericCellValue();
					System.out.println(String.valueOf(value));	
				}
			}
		}
		System.out.println("===Write===");
		Sheet cs= wb.createSheet("test");
		cs.createRow(0).createCell(0).setCellValue("Ruku");
		cs.getRow(0).createCell(1).setCellValue("Miru");
		cs.createRow(1).createCell(0).setCellValue("Vignesh");
		cs.createRow(2).createCell(0).setCellValue("89");
		cs.createRow(3).createCell(0).setCellValue("59");
		FileOutputStream fos =new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		System.out.println("Mission accomplished");
	}

}
