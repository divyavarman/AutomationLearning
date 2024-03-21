package seleniumAdvanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement uploadButton = driver.findElement(By.id("j_idt88:j_idt89"));
		uploadButton.click();
		
		Thread.sleep(3000);
		
		//Control moved to the local system - C:\\Users\\dimani\\Downloads\\TestLeaf Logo.png
		String file = "C:\\Users\\dimani\\Downloads\\TestLeaf Logo.png";
		StringSelection selection = 
				new StringSelection(file);
		
		//For copying the text
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//For pasting the text
	
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
