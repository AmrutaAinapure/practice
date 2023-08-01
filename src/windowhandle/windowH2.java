package windowhandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowH2 {

public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/p[2]/a")).click();
	Thread.sleep(3000);
	Set<String>WindowId= driver.getWindowHandles();
	//it is used to store all opened window id in the set data
	java.util.Iterator<String> It=WindowId.iterator();
	
	String parentwindow=It.next();
	String Childwindow=It.next();
	
	System.out.println("parent window"+parentwindow);
	System.out.println("childwindow"+Childwindow);
	
	List<String>windowList=new ArrayList(WindowId);
	
	String Parent=windowList.get(0);
	String Child=windowList.get(1);
	
	
	System.out.println(Parent);
	
	System.out.println(Child);
	driver.switchTo().window(parentwindow);
	System.out.println(driver.getTitle());
	driver.switchTo().window(Childwindow);
	System.out.println(driver.getTitle());
	
	
	
	
	
}	
	
}
