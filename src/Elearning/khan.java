package Elearning;



	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class khan {
		
		public static void main(String [] args ) throws InterruptedException  {
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);   //implicit wait applied
				
				driver.manage().window().maximize();
				
				driver.get("https://www.khanacademy.org/");
				
				driver.findElement(By.xpath("//a[@id=\"login-or-signup\"]")).click();		
	          //driver.findElement(By.xpath("//a[@class=\"_1sq7o4lg\"]")).click();
	         
	        JavascriptExecutor JS=(JavascriptExecutor) driver;    //Create a Reference
	        
	        WebElement Element=driver.findElement(By.xpath("//span[@class=\"_1aixq078\"]"));
	         
	        //2 methods of JSE-executeScript and executeAsyncScript  
	        //JS.executeScript(Script,Arguments);
	         JS.executeScript("arguments[0].scrollIntoView",Element);      //Call the JavascriptExecutor method
	        // JS.executeAsyncScript("arguments[0].scrollIntoView();",Element);
	         
	         Thread.sleep(3000);        // to wait or pause
	          
	          driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("amrutaainapure25@gmail.com");         //username
	          //driver.findElement(By.xpath("//input[@class=\"_1azps1m\"]")).sendKeys("amu@gmail.com");    //username
	          driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123455");          //password
	          
	          driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();                                //login
	          	
	        		  Thread.sleep(4000);
	        		  
	        		   driver.quit();
	}
	
}
