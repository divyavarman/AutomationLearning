package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Open Chrome browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// 2. Google Home Page
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
	}

}
