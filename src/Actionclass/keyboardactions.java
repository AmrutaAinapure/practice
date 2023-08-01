package Actionclass;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.its.ITSValidityPeriod.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {

	@SuppressWarnings("deprecation")
	public static void main (String[]args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	      driver.get("http://www.facebook.com/");
	       
	      driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	      
	
	WebElement input1=driver.findElement(By.id("email"));
	WebElement input2=driver.findElement(By.id("pass"));
	Thread.sleep(3000);
	input1.sendKeys("This is my first program");
	
	
	Actions act =new Actions(driver);
	//ctrl+A
	act.keyDown(Keys.CONTROL);
	
	act.sendKeys("a");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	
	
	//ctrl+c
      act.keyDown(Keys.CONTROL);
	
	act.sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	//Tab
		act.sendKeys(Keys.TAB);
		act.build().perform();
		
	
     act.keyDown(Keys.CONTROL);
	
	act.sendKeys("v");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	//comparetext
	if(input1.getAttribute("value").equals(input2.getAttribute("value")))
	
	{
		System.out.println("correct copied");
	}
	else {
		System.out.println("incorrect copied");
	}
	
	
	
	
	
	
	
	

	}	
}
