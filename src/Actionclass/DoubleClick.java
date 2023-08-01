package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {


	public static void main (String[]args) throws InterruptedException
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	
	WebElement Double=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	
	
	Actions act =new Actions(driver);
	
	
	act.doubleClick(Double).build().perform();
	
	Thread.sleep(4000);
	driver.switchTo().alert().dismiss();
	
	//driver.quit();
	
	
	
	
	
	
	
	
	}	
	
	
	
	
	
}
