package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class navigate {
	
	
public static void main(String []args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
		
		driver.navigate().to("http://www.amazon.in/");
		Thread.sleep(4000);
		String Title = driver.getTitle();
	System.out.println(Title);
	
	driver.navigate().to("https://www.orangehrm.com/");
	String Title1= driver.getTitle();
	System.out.println(Title1);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.navigate().refresh();
	Thread.sleep(4000);
	driver.close();

}
}