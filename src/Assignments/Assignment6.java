package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	
public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
	//2
    String WindowID=driver.getWindowHandle();
	System.out.println(WindowID);
	Thread.sleep(4000);
	
	//3
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//a[contains(text(),'Visit W3Schools.com!')]")).click();
	
	//4
Set<String>WindowID1= driver.getWindowHandles();
	//it is used to store all opened window id in the set data
	java.util.Iterator<String> It=WindowID1.iterator();
	
	String parentwindow=It.next();
	String Childwindow=It.next();
	
	System.out.println("parent window"+parentwindow);
	System.out.println("childwindow"+Childwindow);
	
	List<String>windowList=new ArrayList(WindowID1);
	
	String Parent=windowList.get(0);
	String Child=windowList.get(1);
	
	
System.out.println(Parent);
	
	System.out.println(Child);
	//5
	// 4. Write to total window handle number to the console. It must be 2.
	
	System.out.println("Total window size handled:"+WindowID1.size());
	System.out.println();
	
	Iterator<String> P1 = WindowID1.iterator();
	String Parent1 = P1.next();
	String Child1 = P1.next();
	
	System.out.println("Parent Window-->"+Parent1);
	System.out.println("Child Window-->"+Child1);
	System.out.println();
	
	// 5.Switch t0 the second window.
	
	driver.switchTo().window(Parent);
	//System.out.println("Parent window-->"+driver.getTitle());
	
	driver.switchTo().window(Child);
	
	// 6.Get the current window’s handle and write to the console window. It must be a second window handle.
	System.out.println("Child window Title-->"+driver.getTitle());
	
	// 7.Check the upper left side logo in the second window.
	
	Boolean B1=driver.findElement(By.xpath("//i[@class=\"fa fa-logo ws-hover-text-green\"]")).isDisplayed();
	System.out.println("Check the Left Handside Logo:"+B1);
	System.out.println();
	
	// 8.Go back (Switch) to the first window.
	
	driver.switchTo().window(Parent);
	
	// 9. 10.Get the current window’s handle and write to the console window. It must be the first window handle.
	System.out.println("Parent window Title-->"+driver.getTitle());
	
	// 10.Check the See Run Button Text. It must contain “Run >” text.
	
	String S1=driver.findElement(By.xpath("//button[contains(text(),'Run')]")).getText();
	System.out.println("Check the Run text:"+S1);
	
    Thread.sleep(3000);
    
    driver.quit();
	
	
	
}	
}
