package seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/frame.xhtml");
			
			driver.switchTo().frame(0);
			Thread.sleep(3000);
			WebElement clickMe = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
			clickMe.click();
			WebElement textVerify = driver.findElement(By.id("Click"));
			String text = textVerify.getText();
			System.out.println("Text is : "+text);
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame(2);
			driver.switchTo().frame("frame2");
			Thread.sleep(3000);
			WebElement clickMe2 = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
			clickMe2.click();
			WebElement textVerify2 = driver.findElement(By.id("Click"));
			String text2 = textVerify2.getText();
			System.out.println("Text for nested frame: "+text2);
			
			driver.switchTo().defaultContent();
			List<WebElement> iframeTag = driver.findElements(By.tagName("iframe"));
			int iframeSize = iframeTag.size();
			System.out.println("Printing iframe count : "+ iframeSize);
			

	}

}
