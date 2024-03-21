package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement input =driver.findElement(By.id("j_idt87:auto-complete_input"));
		input.sendKeys("s");
		
		Thread.sleep(3000);
		
		List<WebElement> listOptions= 
				driver.findElements(By.xpath("//*[@id='j_idt87:auto-complete_panel']/ul/li"));
		System.out.println(listOptions.size());
		for (WebElement webElement : listOptions) {
			System.out.println(webElement.getText());
			
			if(webElement.getText().equals("Selenium WebDriver")) {
				webElement.click();
				break;
			}
			else
			{
				System.out.println("Unable to find the text");
			}
			
		}
		
		
	}

}
