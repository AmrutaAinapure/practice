package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class permissionpopup {

	
	public static void main (String[]args) throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		
   	option.addArguments("disable-notification");
		//java script alert n confirmation popup
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hdfcbank.com/");
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
}
}