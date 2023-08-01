package Assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentss4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
    driver.get("https://kite.zerodha.com/");

	
	String File ="kite";

	

	
	/* assignmentss4.Takescreenshot(File);
	 assignmentss4.Takescreenshot("Test"+File);
	 assignmentss4.Takescreenshot("Test1"+File);
	driver.quit();
	*/
	}

		
	}

		
	


