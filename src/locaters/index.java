package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class index {
	
	
	
	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	       driver.get("http://www.amazon.in/");
	       driver.findElement(By.xpath("(//a[@class=\"nav-a\"])[8]")).click();

}
}