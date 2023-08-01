package windowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowH1 {
	
	
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
	
	
	String WindowID=driver.getWindowHandle();
	
	
	System.out.println(WindowID);
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}