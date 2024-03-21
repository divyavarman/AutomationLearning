package handsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		WebElement chromeRadio = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/div"));
		boolean chromeStatus = chromeRadio.isSelected();
		
		WebElement firefoxRadio = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[2]/div"));
		boolean firefoxStatus = chromeRadio.isSelected();
		
		WebElement safariRadio = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div"));
		boolean safariStatus = safariRadio.isSelected();
		
		WebElement edgeRadio = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[4]/div"));
		boolean edgeStatus = edgeRadio.isSelected();
		
		System.out.println("Chrome Radio Status : "+ chromeStatus);
		System.out.println("FF Radio Status : "+ firefoxStatus);
		System.out.println("Safari Radio Status : "+ safariStatus);
		System.out.println("Edge Radio Status : "+ edgeStatus);

		
		WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]"));
		radioButton.click();
		
		
	}

}
