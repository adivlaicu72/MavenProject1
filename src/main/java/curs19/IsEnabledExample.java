package curs19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class IsEnabledExample extends BaseTest {

	
	@Test
	public void isEnabled() {
		
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		
		browser.findElement(By.cssSelector("li[class='menu_user_login']>a")).click();
		
		WebElement passfield = browser.findElement(By.cssSelector("input[name='pwd']"));
		
		System.out.println(passfield.isEnabled());
		
		jse.executeScript("arguments[0].setAttribute('disabled', '')", passfield);
		
		System.out.println("Vizibil? : " + passfield.isDisplayed());
		
		// passfield.sendKeys("Test");
		System.out.println(passfield.isEnabled());
		
	}
	
}
