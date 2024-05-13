package curs16;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestDependencyExample {
	
	@Test(priority = 1)
	public void method1() {
		assertTrue(false);
		System.out.println("Method 1");
	}
	
	@Test(priority = 2, dependsOnMethods = "method1")
	public void method2() {
		System.out.println("Method 2");
	}
	
	@Test(priority = 3, dependsOnMethods = "method2", alwaysRun = true)
	public void method3() {
		System.out.println("Method 3");
	}
	
	@Test(invocationCount = 5)
	public void method4() {
		System.out.println("Method 4");
	}
	

}
