package com.maven.org.MavenMiruProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivenfw {

	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\User\\eclipse-workspace\\MavenMiruProject\\target\\writeandread.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		//----read----//
		Sheet s = wb.getSheetAt(0);
		for(int i=0; i<s.getPhysicalNumberOfRows();i++) {
			Row r = s.getRow(i);
		for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
			Cell c = r.getCell(j);
			CellType ct = c.getCellType();
			if(ct.equals(ct.STRING)) {
				System.out.println(c.getStringCellValue());
			}else {
				double v = c.getNumericCellValue();
				System.out.println(String.valueOf(v));
			}
		}
		}
		//----write----//
		Sheet cs = wb.createSheet("write");
		cs.createRow(0).createCell(0).setCellValue("Miru");
		cs.createRow(1).createCell(0).setCellValue("Vignesh");
		cs.createRow(2).createCell(0).setCellValue("chintu");
		cs.createRow(3).createCell(0).setCellValue("tharuna");
	
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("task finished");
	
	}

}
