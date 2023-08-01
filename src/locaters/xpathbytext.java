package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbytext {
	
		
		public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	       driver.get("http://www.facebook.com/");
	       driver.findElement(By.xpath("//input[@aria-label=\"Email address or phone number\"]")).sendKeys("amrutaainapure25@gmail.com");
	       driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("Amruta03");
	      // driver.findElement(By.xpath("//a[text()=\"Create a Page\"]")).click();
	      // driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Cr')]")).click();
	
	
	

}
}								                                                                                                                                                                       														