package Homework_MavenProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class Homework1 extends BaseTest{
	
	@Test
	public void loginTestLocatorChecking() {

		WebElement discoverText = browser.findElement(By.linkText("Login"));
		System.out.println(discoverText.getText());	
		assertEquals(discoverText.getText(), "Login");
		
		discoverText.click();
		
		WebElement discoverLogin = browser.findElement(By.id("log"));
		assertTrue(discoverLogin.isDisplayed());
		
		WebElement discoverPassword = browser.findElement(By.id("password"));
		assertTrue(discoverPassword.isDisplayed());
	
		
		
		
	}
	
}
