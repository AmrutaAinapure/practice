package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {
	
	
	
	public static void main (String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
    driver.findElement(By.xpath("//a[contains(text(),'Cr')]")).click();
Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Amruta");
	
	driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Ainapure");
	
	driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("amu@gmail.com");
	
driver.findElement(By.id("password_step_input")).sendKeys("100897");
 WebElement Day=driver.findElement(By.id("day"));
  Select Day1= new Select(Day);
  Day1.selectByVisibleText("3");
  
  
  WebElement Month = driver.findElement(By.id("month"));
  
  Select Month1= new Select(Month);
  Month1.selectByVisibleText("Oct");
  
  
  WebElement Year = driver.findElement(By.id("year"));
  Select Year1 =new Select(Year);
  Year1.selectByVisibleText("2000");
  
  
  
  
}
}