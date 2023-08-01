package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nobroker {

	
	public static void main (String[]args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.yahoo.com/?.intl=in");
	driver.findElement( By.xpath("//input[@id=\"login-username\"]")).sendKeys("amruta@yahoo.com");
	
    driver.findElement(By.xpath("//a[contains(text(),'Cr')]")).click();

	
	   //driver.findElement(By.linkText("Forgotten username?")).click();

	
	}
	
	
	
	
	
}
