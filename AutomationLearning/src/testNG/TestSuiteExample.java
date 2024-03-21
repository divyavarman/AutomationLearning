package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuiteExample {
	long startTime =System.currentTimeMillis();
	WebDriver driver = new ChromeDriver();	

	//Aim - open chrome and go on
	//1. Open Google.co.in 
	//2. Open Bing.com
	//3. Open Yahoo.com
	//Close the browser
	
	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	}
	
	@Test
	public void openGoogle() {
		driver.get("http://www.google.co.in");
	}
	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}
	@Test
	public void openYahoo() {
		driver.get("https://www.yahoo.com/");
	}
	@AfterSuite
	public void closeBroser() {
		driver.quit();
		long endTime =System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("The total time is : "+totalTime);
		
	}
}
