package curs16;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftVsHardAssertion {

	/*
	 * 1. hard assertion
	 * 2. soft assertion
	 */
	
	@Ignore
	public void hardAssertExample() {
		System.out.println("Code here");
		assertFalse(true);
		System.out.println("Some other code here");
		assertNotNull(null);
		System.out.println("Final code here");	
	}
	
	@Test
	public void softAssert() {
		System.out.println("Code here");
		SoftAssert sa = new SoftAssert();
		sa.assertFalse(true);
		System.out.println("Some other code here");
		sa.assertNotNull(null);
		System.out.println("Final code here");
		sa.assertAll();
	}
	
	
}
