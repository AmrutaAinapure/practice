package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	
	
	
	
	
public static void main (String[]args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Automation");
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	
	
	
	
	
}


}