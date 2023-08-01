package windowhandle;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowH3 {
	
	
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
	Thread.sleep(4000);

	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/p[2]/a")).click();
	Set<String>WindowId= driver.getWindowHandles();
	
	java.util.Iterator<String> It=WindowId.iterator();
	
	String parentwindow=It.next();
	String Childwindow=It.next();
	
	System.out.println("parent window"+parentwindow);
	System.out.println("childwindow"+Childwindow);
	
	
	
	driver.switchTo().window(parentwindow);
	System.out.println(driver.getTitle());
	driver.switchTo().window(Childwindow);
	System.out.println(driver.getTitle());
	
	
	driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("test@gmail.com");
	
	driver.findElement(By.id("Form_submitForm_action_request")).click();                                  
	
	driver.switchTo().window(parentwindow);
	
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Amruta");
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("123");
	
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	driver.quit();
	
	
	
	

}
}