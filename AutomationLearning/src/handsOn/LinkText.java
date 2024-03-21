package handsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		
//		driver.findElement(By.linkText("Go to Dashboard")).click();
		
		driver.findElement(By.partialLinkText("broken")).click(); 
		//If more than 1 occurrence is there, it will click the first matching element
		//Also, casing should match
	}

}
