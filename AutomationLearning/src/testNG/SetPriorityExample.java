package testNG;

import org.testng.annotations.Test;

public class SetPriorityExample {

	@Test(priority=0)
	public void turnOnCar() {
		System.out.println("The car is turned on");
	}
	
	@Test(priority=0)
	public void putFirstGear() {
		System.out.println("First gear");
	}
	
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("Second gear");
	}
	
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Third gear");
	}
	
	@Test(priority=4)
	public void giveAccelerator() {
		System.out.println("The accelerator is given");
	}
	
	@Test(priority=5)
	public void moveTheCare() {
		System.out.println("The car is moving");
	}
}
