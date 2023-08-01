package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathattribute {
	public static void main(String []args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
       driver.get("http://www.facebook.com/");
       driver.findElement(By.xpath("//input[@aria-label=\"Email address or phone number\"]")).sendKeys("amrutaainapure25@gmail.com");
}
}