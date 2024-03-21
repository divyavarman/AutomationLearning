package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/calendar.xhtml");
		
		WebElement today = driver.findElement(By.xpath("//td[contains(@class,'day-today')]"));
		today.click();
		Thread.sleep(3000);
		WebElement title = driver.findElement(By.id("j_idt87:title"));
		title.click();
		title.sendKeys("Divya");
		
		WebElement fromDate = driver.findElement(By.id("j_idt87:from_input"));
		fromDate.click();
		fromDate.sendKeys("15/04/2024 14:01");
		

	}

}
