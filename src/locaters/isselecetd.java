package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselecetd {
	
	
	
	
	public static void main (String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
    driver.findElement(By.xpath("//a[contains(text(),'Cr')]")).click();
Thread.sleep(3000);
	
//driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
 //boolean Button =  driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
 // System.out.println(Button);
 
 // boolean B1 =  driver.findElement(By.xpath("//input[@id=\"u_3_5_U/\"]")).isSelected();
     // System.out.println(B1);

     // driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
     // boolean B2 =  driver.findElement(By.xpath("//input[@value=\"2\"]")).isSelected();
     // System.out.println(B2);
      
     // driver.findElement(By.xpath("//input[@value=\"-1\"]")).click();
      boolean B3= driver.findElement(By.xpath("//input[@value=\"-1\"]")).isSelected();
      System.out.println(B3);
}
}