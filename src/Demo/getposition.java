package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getposition {

	public static void main(String []args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("input")).sendKeys("Facebook");
		
		//Thread.sleep(10000);
		//System.out.println(driver.manage().window().getPosition());
	//driver.close();
		//System.out.println(driver.manage().window().getSize());
	
	//driver.close();
	
}
}