package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.link-assistant.com/news/fixing-broken-images.html");
		
		//Find the broken image
		
		WebElement image = driver.findElement(By.xpath("/html/body/div[4]/article/div[2]/div[2]/div[2]/img"));
		if (image.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is broken");
		}
		else
		{
			System.out.println("Image is not broken");
		}
		
	}

}
