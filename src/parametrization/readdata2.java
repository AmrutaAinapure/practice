package parametrization;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata2 {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\Admin\\Documents\\amu.xlsx";
		
		
		FileInputStream file = new FileInputStream(path);// to open file
	    XSSFWorkbook workbook = new XSSFWorkbook(file);
	    String data = workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
	    System.out.println(data);
	    
	    
	    FileInputStream file1 = new FileInputStream(path);// to open file
	    XSSFWorkbook workbook1 = new XSSFWorkbook(file1);
	    String data1 = workbook.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
	    System.out.println(data1);
	    
	    FileInputStream file2 = new FileInputStream(path);// to open file
	    XSSFWorkbook workbook2 = new XSSFWorkbook(file2);
	    String data2 = workbook.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
	    System.out.println(data2);

	}

}


