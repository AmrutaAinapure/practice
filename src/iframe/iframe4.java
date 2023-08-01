package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe4 {

	
	
	
	
	
public static void main (String[]args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();	
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
	driver.switchTo().frame("iframeResult");
	Thread.sleep(4000);
	driver.switchTo().frame(0);
	String text= driver.findElement(By.xpath("//h1[contains(text(),'This page')]")).getText();
	System.out.println(text);
	
	driver.switchTo().parentFrame();
	String text1= driver.findElement(By.xpath(" //p[contains(text(),'You can use the')]")).getText();
	System.out.println(text1);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[@onclick=\"openMenu()\"]")).click();
	System.out.println("complete");
}
}