package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextInSearchBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		//Enter a search term
		
		driver.findElement(By.className("gLFyf")).sendKeys("Singara Chennai"+ Keys.ENTER);
		
		//Click the wikipedia link
		
		
		
	}

}
