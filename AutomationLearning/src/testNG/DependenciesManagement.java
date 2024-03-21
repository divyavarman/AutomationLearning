package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	//Problem 1 -  You have to admit a student to Engineering
	//Problem 2 -  You have to admit a student to Higher Secondary
	
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("Passed High School");
	}
	
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Passed Higher Secondary School");
	}
	
	@Test(dependsOnMethods = "higherSecondary")
	public void engineering() {
		System.out.println("Passed Engineering");
		
	}

}
