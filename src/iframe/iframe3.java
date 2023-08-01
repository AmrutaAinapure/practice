package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 {

	
	
public static void main (String[]args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();	
	driver.get("https://demo.automationtesting.in/Frames.html");	
	driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
	WebElement outerframe= driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
	driver.switchTo().frame(outerframe);
	
	String text= driver.findElement(By.xpath("//h5[contains(text(),'Nested iFrames')]")).getText();
	
	System.out.println(text);
	WebElement innerframe= driver.findElement(By.xpath("/html/body/section/div/div"));
	driver.switchTo().frame(innerframe);
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");

driver.switchTo().defaultContent();
driver.findElement(By.xpath("//a[contains(text(),'Webtable')]")).click();
System.out.println("Exexution complete");



}
}