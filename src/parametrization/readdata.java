package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata {
	
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		//String Path = "C:\\Users\\Admin\\Documents\\amu.xlsx";
		
		//FileInputStream file = new FileInputStream(Path);// to open file
		
	//XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
       // System.out.println(Data);
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\Admin\\Documents\\amu.xlsx");
		String Data1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		//XSSFWorkbook workbook = new XSSFWorkbook(file1);
		//String Data1 = workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();/
		
		System.out.println(Data1);
	
	
	
}	

}
