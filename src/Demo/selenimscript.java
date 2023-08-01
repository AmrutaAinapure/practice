package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class selenimscript {

	public static void main(String []args) {
			
			
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.redbus.com/");
			System.out.println(driver.getTitle());
			String URL= driver.getCurrentUrl();
			System.out.println(URL);
			if(URL.equals("https://www.amazon.in/"))
				System.out.println("correct url");
			else {
				System.out.println("Incorrect url");
			}
			driver.close();
		}

}