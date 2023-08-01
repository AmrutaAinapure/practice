package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {
	public static void main (String[]args) throws InterruptedException {
	
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







driver.findElement(By.id("day")).click();
driver.findElement(By.xpath("//option[contains(text(),\"3\")]")).click();



driver.findElement(By.id("month")).click();
driver.findElement(By.xpath("//option[contains(text(),\"Oct\")]")).click();

driver.findElement(By.id("year")).click();
driver.findElement(By.xpath("//option[contains(text(),\"2020\")]")).click();




}
	
	
}