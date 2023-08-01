package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class childwindowpopup {

	
	public static void main (String[]args) throws InterruptedException
	{
		
   
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	String parentwindow= driver.getWindowHandle();
	System.out.println(parentwindow);
	
	Set<String>CWS=driver.getWindowHandles();
	
	
	for(String childWindow:CWS) {
		if(!parentwindow.equalsIgnoreCase(childWindow)) {
			driver.switchTo().window(childWindow);
			
			String Text1=driver.findElement(By.xpath("/html/body/div/main/section[1]/div/div/div/h1")).getText();
			System.out.println(Text1);
			driver.close();
			
			
		}
		
	}
	
	
	driver.switchTo().window(parentwindow);
	String Text2=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1")).getText();
	System.out.println(Text2);
	
	
	
	
	
	
	
	
	
	}	
}
