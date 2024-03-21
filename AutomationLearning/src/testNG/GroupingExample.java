package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
//	Scenario : A big  basket is having different kinds of mobile 
//	Apple, Moto, Vivo and Lenovo
//	I want to run tests only for Vivo and Moto Phones Write a program for that
	
	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Apple 1 Testing");	
	}
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple 2 Testing");	
	}
	@Test(groups = {"Moto"})
	public void moto1() {
		System.out.println("Moto 1 Testing");	
	}
	@Test(groups = {"Moto"})
	public void moto2() {
		System.out.println("Moto 2 Testing");	
	}
	@Test(groups = {"Vivo"})
	public void vivo1() {
		System.out.println("Vivo 1 Testing");	
	}
	@Test(groups = {"Vivo"})
	public void vivo2() {
		System.out.println("Vivo 2 Testing");	
	}
	@Test(groups = {"Lenovo"})
	public void lenovo1() {
		System.out.println("Lenovo 1 Testing");	
	}
	@Test(groups = {"Lenovo"})
	public void lenovo2() {
		System.out.println("Lenovo 2 Testing");	
	}
	
	
}