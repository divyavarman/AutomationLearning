package handsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement automationTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select select = new Select(automationTool);
		select.selectByIndex(1);
		
		WebElement countryDrop = driver.findElement(By.id("j_idt87:country"));
		countryDrop.click();
		WebElement countryValue = driver.findElement(By.xpath("//li[@data-label='India']"));
		countryValue.click();
		automationTool.sendKeys("Playwright");
		
		WebElement cityDrop = driver.findElement(By.id("j_idt87:city"));
		cityDrop.click();
		WebElement cityValue = driver.findElement(By.xpath("//li[@data-label='Chennai']"));
		cityValue.click();
		
	}

}
