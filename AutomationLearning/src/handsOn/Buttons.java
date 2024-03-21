package handsOn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Buttons {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dimani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		driver.findElement(By.id("j_idt88:j_idt90")).click();
		
		//Get the XY Position
		
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement getButtonPostion = driver.findElement(By.id("j_idt88:j_idt94"));
		
		Point xyPoint = getButtonPostion.getLocation();
		
		int xValue = xyPoint.getX();
		int yValue = xyPoint.getY();
		
		System.out.println("X Value is : " +xValue+ " Y value is : " + yValue);
		
		// Find the color
		
		WebElement buttonColor = driver.findElement(By.id("j_idt88:j_idt96"));
		String bgcolor = buttonColor.getCssValue("background-color");
		
		System.out.println("Color of the Save button is : " +bgcolor);
		
		//Find the size
		WebElement buttonSize = driver.findElement(By.id("j_idt88:j_idt90"));
		int height = buttonSize.getSize().getHeight();
		int width = buttonSize.getSize().getWidth();
		
		System.out.println("Height Value is : " +height+ " Width value is : " + width);
		
		//Find the size (height and width)
		
		WebElement buttonSize1 = driver.findElement(By.id("j_idt88:j_idt98"));
		int height1 = buttonSize1.getSize().getHeight();
		int width1 = buttonSize1.getSize().getWidth();
		
		System.out.println("Height Value is : " +height1+ " Width value is : " + width1);
		
		//Find the color change
		
		WebElement colorChange = driver.findElement(By.id("j_idt88:j_idt100"));
		String oldColor = colorChange.getCssValue("background-color");
		Actions action = new Actions(driver);
		action.moveToElement(colorChange).perform();
		String newColor = colorChange.getCssValue("background-color");
		
		System.out.println("Old Color is : "+oldColor+ "New color is : "+newColor);
		
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		driver.findElement(By.id("j_idt88:j_idt107")).click();
		
		List<WebElement> noOfRoundButton = driver.findElements(By.className("rounded-button"));
		
		int roundButtons = noOfRoundButton.size();
		
		System.out.println("Number of round buttons: "+ roundButtons);
		
		

		

		
		
		
		
		
		
		
	}

}
