package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	
	
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	       driver.get("http://www.google.com/");
	       Thread.sleep(5000);
	      // driver.findElement(By.id("APjFqb")).sendKeys("Amruta Ainapure");
              	
	       //driver.findElement(By.name("q")).sendKeys("Amruta Ainapure");
	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Amruta Ainapure");

}
}
