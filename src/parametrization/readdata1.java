package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	
	
	public class readdata1 {
		public static void main(String[] args) throws IOException, InterruptedException {
			
			// to fetch string data from excel sheet
			
			String path ="C:\\Users\\Admin\\Documents\\amu.xlsx";
		   // FileInputStream file = new FileInputStream(path);// to open file
			FileInputStream file= new FileInputStream(path);
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		    String data1 = workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		    System.out.println(data1);
		    
		    
		   String data2 = workbook.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
		   //WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		   System.out.println(data2);
		    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(data1);
			driver.findElement(By.id("pass")).sendKeys(data2);
			
			driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
			Thread.sleep(4000);
		}
		}
	
	
	
	
	


