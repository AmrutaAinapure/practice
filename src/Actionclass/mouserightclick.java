package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouserightclick {

	
	public static void main (String[]args) throws InterruptedException
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
	
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement button= driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	
	
	Actions act=new Actions(driver);
	
	
	act.contextClick(button).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	Thread.sleep(4000);
	act.contextClick(button).build().perform();
	driver.findElement(By.xpath("/html/body/ul/li[4]")).click();
	
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	Thread.sleep(4000);
	
	
	
	
	
	
	
	
	
	
	
	
}
}