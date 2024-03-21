package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksAdvanced {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		WebElement element = driver.findElement(By.linkText("Go to Dashboard"));
		element.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
		
		//Find where am i supposed to go without clicking it
		
		WebElement element2 = driver.findElement(By.partialLinkText("Find the URL"));
		String target =element2.getAttribute("href");
		System.out.println("The link is going to : "+ target);
		
		//Verify broken
		
		WebElement element3 = driver.findElement(By.linkText("Broken?"));
		element3.click();
		String tabTitle =driver.getTitle();
		System.out.println("The tab title is : "+tabTitle);
		if (tabTitle.contains("404")) {
			System.out.println("Link is broken");
		}
		else {
			System.out.println("Link is not broken");
		}
		driver.navigate().back();
		
		WebElement element_duplicate = driver.findElement(By.linkText("Go to Dashboard"));
		element_duplicate.click();
		driver.navigate().back();
		
		List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
		int linksCount = noOfLinks.size();
		System.out.println("Link count is :"+linksCount);
	}

}
