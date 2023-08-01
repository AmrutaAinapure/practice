package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup3 {

	
	
public static void main (String[]args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	    Thread.sleep(3000);
	    
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
	boolean Text= driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
	System.out.println(Text);
	//driver.quit();
	
	
	
	
	
}
}