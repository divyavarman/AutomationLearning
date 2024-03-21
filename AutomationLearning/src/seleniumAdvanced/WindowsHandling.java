package seleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement openButton = driver.findElement(By.id("j_idt88:new"));
		openButton.click();
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);//It will iterate the for loop till it has a value in the handles & control will move 
//																			to the newly opened window
		}
		
		driver.findElement(By.id("email")).sendKeys("divya4shema@gmail.com");
		driver.findElement(By.id("message")).sendKeys("Nice Application for Testing");
		driver.findElement(By.id("j_idt130")).click();
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		
		//Find the number of opened windows
		
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		int sizeOfOpenedWindows = driver.getWindowHandles().size();
		System.out.println("No of opened windows: "+sizeOfOpenedWindows);
		
		//Close the opened windows and omit the parent window
		Set<String> noOfWindows = driver.getWindowHandles();
		for (String closeWindow : noOfWindows) {
			  if (!closeWindow.equals(oldWindow)) {
			driver.switchTo().window(closeWindow);
			driver.close();
			  }
		}
		
		//Close the opened windows including parent window
		driver.switchTo().window(oldWindow);
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		Set<String> openedWindows = driver.getWindowHandles();
		for (String closeIt : openedWindows) {
			if(!closeIt.equals(oldWindow)) {
				driver.switchTo().window(closeIt);
				driver.close();//Close the current focus window
			}	
			
			driver.quit();//Close all the windows which was opened using the driver
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
