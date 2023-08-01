package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	
	
	
	public static void main (String[]args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
      driver.get("http://www.redbus.in/");
       
       driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Pune");
      driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Mumbai");
       // driver.findElement(By.id("onwardCal")).click();
    //  WebElement dateBox = driver.findElement(By.xpath("//input[@class=\"db text-trans-uc\"]"));
     // dateBox.sendKeys("1june2023");
      //dateBox.sendKeys(Keys.TAB);

       driver.findElement(By.xpath("//input[@class=\"db text-trans-uc\"]")).click();

       
    //  driver.findElement(By.xpath("//Button[@class=\"sc-dxgOiQ eQQkuo\"]")).click();
    //driver.get("https://www.netflix.com/in/");   
    //driver.findElement(By.name("email")).sendKeys("amruta@.com");
       
}
}