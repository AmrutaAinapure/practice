package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement1 {
	
	

	public static void main (String[]args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();	
	driver.get("https://www.amazon.in/");
	
   WebElement searchbox= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
  searchbox.sendKeys("oneplus");
   WebElement Links= driver.findElement(By.xpath("//input[@class=\"nav-input nav-progressive-attribute\"]"));
   System.out.println(Links.getText());
   
  
}
}


