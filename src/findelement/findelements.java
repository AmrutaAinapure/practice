package findelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {


	public static void main (String[]args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();	
	driver.get("https://www.amazon.in/");
	
	List<WebElement> searchbox=driver.findElements(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

	driver.findElements(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	List<WebElement> Links=driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
System.out.println(Links.size());
for (WebElement ele:Links) {
	System.out.println(ele.getText());
}
List<WebElement> Link1=driver.findElements(By.xpath("//a[@class=\"nav  \"]"));
System.out.println(Link1.size());

}
}