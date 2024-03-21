package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");

		WebElement dragElement = driver.findElement(By.id("form:drag_content"));
		WebElement dropElement = driver.findElement(By.id("form:drop"));

		Actions action = new Actions(driver);
//		action.clickAndHold(dragElement).moveToElement(dropElement).release(dropElement).build().perform();
		action.dragAndDrop(dragElement, dropElement).build().perform();
	}

}
