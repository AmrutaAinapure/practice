package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ss1 {

	
	public static void main (String[]args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	      driver.get("http://www.redbus.in/");
	       Thread.sleep(4000);
	
	       File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	   		File Dest =new File("C:\\Users\\Admin\\Desktop\\11march\\sample1.jpg");

	
	FileHandler.copy(source,Dest);
	
	
	driver.quit();
}
}