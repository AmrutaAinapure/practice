package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readdata3 {
	
		public static void main(String[] args) throws IOException {
	String path="C:\\Users\\Admin\\Documents\\amu.xlsx";
			
			
			FileInputStream file = new FileInputStream(path);// to open file
		   // XSSFWorkbook workbook = new XSSFWorkbook(file);
		    String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		    System.out.println(data);
		    
		    FileInputStream file1 = new FileInputStream(path);// to open file
			   // XSSFWorkbook workbook = new XSSFWorkbook(file);
			    String data1 = WorkbookFactory.create(file1).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
			    System.out.println(data1);
			    
			    FileInputStream file2 = new FileInputStream(path);// to open file
				   // XSSFWorkbook workbook = new XSSFWorkbook(file);
				    String data2 = WorkbookFactory.create(file2).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
				    System.out.println(data2);
				    
				    FileInputStream file3 = new FileInputStream(path);// to open file
					   // XSSFWorkbook workbook = new XSSFWorkbook(file);
					    double data3 = WorkbookFactory.create(file3).getSheet("sheet2").getRow(0).getCell(0).getNumericCellValue();
					    System.out.println(data3);
					    
					    FileInputStream file4 = new FileInputStream(path);// to open file
						   // XSSFWorkbook workbook = new XSSFWorkbook(file);
						    boolean data4 = WorkbookFactory.create(file4).getSheet("sheet3").getRow(0).getCell(0).getBooleanCellValue();
						    System.out.println(data4);
					    
		}

	}


