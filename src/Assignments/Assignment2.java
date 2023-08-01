package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	


	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bkban\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		
		Thread.sleep(3000);
		
		
	String Text = driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]")).getText();
		System.out.println(Text);
		
		
				driver.quit();
		
	
		
		

}
}
	
	
	
	
	
	
	
	
	
	
