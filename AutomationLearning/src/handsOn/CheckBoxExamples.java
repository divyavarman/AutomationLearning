package handsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement basicCheck = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']/div[2]"));
		basicCheck.click();
		
		boolean basicStatus = basicCheck.isSelected();
		Thread.sleep(3000);
		System.out.println(basicStatus);
		
		WebElement alertCheck = driver.findElement(By.id("j_idt87:j_idt91"));
//		alertCheck.click();
//		
//		boolean alertStatus = alertCheck.isSelected();
//		Thread.sleep(3000);
//		System.out.println(alertStatus);
		if(!alertCheck.isSelected())
		{
			alertCheck.click();
		}
		else
		{
			System.out.println("Printing else part");
		}
		
	}

}
