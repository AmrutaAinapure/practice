package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup4 {

	
	
public static void main (String[]args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	    Alert Text =driver.switchTo().alert();
	    System.out.println("Alert message---->"+Text.getText());
	    Text.sendKeys("Welcome");
	    
	    Thread.sleep(3000);
	    Text.accept();
	    Thread.sleep(2000);
}
}