package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopup {

	
	
	
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/upload");
	
	driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\Admin\\Documents\\amu.xlsx");
	
	driver.findElement(By.id("file-submit")).click();
	Thread.sleep(3000);
	
	
	
	
	
	
}
}