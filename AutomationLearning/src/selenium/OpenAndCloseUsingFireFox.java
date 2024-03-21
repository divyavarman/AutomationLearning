package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAndCloseUsingFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dimani\\Downloads\\Automation\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");

	}

}
