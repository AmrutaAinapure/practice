package listbox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.Strings;


public class listbox4 {

	
	public static void main (Strings[] args) throws InterruptedException
	{

		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	    driver.findElement(By.xpath("//a[contains(text(),'Cr')]")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Amruta");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Ainapure");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("amu@gmail.com");
		
	driver.findElement(By.id("password_step_input")).sendKeys("100897");
	 
		
	 WebElement Day=driver.findElement(By.xpath("//select[@id=\"day\"]"));

	//  WebElement Month = driver.findElement(By.xpath("//select[@id=\"month\"]"));

		
	//  WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));

	  Select s1= new Select(Day);
	  List<WebElement> ListDay= s1.getOptions();
		System.out.println("Totaldays"+ListDay.size());
	}
	
	
	
}
	

