package curs16;

import static org.testng.Assert.assertEquals;

import org.testng.TestException;
import org.testng.annotations.Test;

public class AssertionExample {

	String actualResult = "Test";
	String expectedResult = "Masina";
	
	//@Test
	public void checKEquality() {
		
		if(expectedResult.equals(actualResult)) {
			
			System.out.println("Test is passed");	
			
		}else {
			System.out.println("Test is failed");
			throw new TestException("Expected :" 
			+ expectedResult + " but got " + actualResult);
		}
	
	}
	@Test
	public void checkEquality2() {
		assertEquals(expectedResult, actualResult);
	}
	
	
}
