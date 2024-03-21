package handsOn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement alertBox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertBox.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement cancelBox =driver.findElement(By.id("j_idt88:j_idt93"));
		cancelBox.click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		WebElement promptBox = driver.findElement(By.id("j_idt88:j_idt104"));
		promptBox.click();
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Divya Bharathi Mani");
		promptAlert.accept();
	}

}
