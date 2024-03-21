package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndCloseBrowser {
	
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
//		driver.close();
		driver.quit();
	}

}
