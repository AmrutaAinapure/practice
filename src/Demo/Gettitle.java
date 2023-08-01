package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	
public static void main(String []args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.close();
		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if (Title.equals(ExpectedTitle)) {
			System.out.println("Correct Title");
			
		}
		else {
			System.out.println("Incorrect title");
		}
}
}//https://www.amazon.in/>Online Shopping site in India: Shop Online for Mobile, Books, Watches, Shoes and More - Amazon.i