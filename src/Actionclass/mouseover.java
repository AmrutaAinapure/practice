package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main (String[]args) throws InterruptedException
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
	
	
	WebElement Account=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
	
	
	Actions act =new Actions(driver);
	
	
	act.moveToElement(Account).build().perform();
	
	driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("amrutaainapure25@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("12345");
	driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	Thread.sleep(4000);
	//boolean Text= driver.findElement(By.xpath(""))
	
	
	
	
	
	
	
	
	
	
	
	
}
}