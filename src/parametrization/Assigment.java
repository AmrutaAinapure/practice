package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assigment {


	
	public static void main(String[] args) throws IOException 
	{
		
		
		
		String path="C:\\Users\\Admin\\Documents\\amu.xlsx";

		
		FileInputStream file= new FileInputStream(path);
		XSSFWorkbook work =new XSSFWorkbook(file);
		XSSFSheet Sheet=work.getSheetAt(3);
	    String data1 = work.getSheetAt(3).getRow(3).getCell(3).getStringCellValue();
	    System.out.println(data1);
		int Rows=Sheet.getLastRowNum();
		System.out.println(Rows);
		int cols=Sheet.getRow(0).getLastCellNum();
		System.out.println(cols);
		
		for(int R=0;R<=Rows;R++) 
		{
			
			XSSFRow row =Sheet.getRow(R);
			
			for (int c=0;c<cols;c++) 
			{
				
				
				
				XSSFCell cell=row.getCell(c);
			
				switch(cell.getCellType()) 
				{
					case STRING:
						System.out.print(cell.getStringCellValue());
	                    break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue());
						break;
					
				}
				System.out.print(" || ");
				
			}
			
			
			
		} 
		
		
	}
}
