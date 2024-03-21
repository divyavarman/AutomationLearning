package seleniumAdvanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement downloadFile = driver.findElement(By.id("j_idt93:j_idt95"));
		downloadFile.click();
		
		Thread.sleep(3000);
		
		//Move to Downloads folder
		
		File fileLocation = new File("C:\\Users\\dimani\\Downloads");
		File[] totalFiles = fileLocation.listFiles();
		for (File file : totalFiles) {
			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File got downloaded successfully!");
				break;
			}
		}
		

	}

}
