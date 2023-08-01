package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {
	
	
	
	
	
	
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	       driver.get("http://www.facebook.com/");
	       driver.findElement(By.xpath("//input[@aria-label=\"Email address or phone number\"]")).sendKeys("amrutaainapure25@gmail.com");
	       driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("Amruta03");
	       
   //driver.findElement(By.linkText("Forgotten password?")).click();
Thread.sleep(4000);
driver.findElement(By.partialLinkText("Cre")).click();

}

}
