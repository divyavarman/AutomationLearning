package handsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.findElement(By.id("j_idt88:name")).sendKeys("Divya Bharathi Mani");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" Singara Chennai");
		WebElement disabledTextBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enabled = disabledTextBox.isEnabled();
		
		System.out.println("The state of the text box is : " +enabled);
		
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		WebElement textBoxTextdriver=driver.findElement(By.id("j_idt88:j_idt97"));
		System.out.println("The text inside the textbox is : "+ textBoxTextdriver.getAttribute("value"));
		
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("divya4shema@gmail.com"+Keys.TAB);
		
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("Printing the value");
		
	}

}
