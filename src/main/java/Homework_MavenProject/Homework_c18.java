package Homework_MavenProject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class Homework_c18 extends BaseTest {

	@Test
	public void testSentMessageFromContactPage() {
		
		browser.get("https://keybooks.ro/contacts/");
		
		browser.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-name']")).click();
		browser.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-name']>input")).sendKeys("Adi");
		
		browser.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-email']")).click();
		browser.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-email']>input")).sendKeys("adi@email.com");
		
		browser.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-s']")).click();
		browser.findElement(By.cssSelector("div span[class='wpcf7-form-control-wrap your-s']>input")).sendKeys("Test");
		
		browser.findElement(By.cssSelector("span[class='wpcf7-form-control-wrap your-message']")).click();
		browser.findElement(By.cssSelector("span[class='wpcf7-form-control-wrap your-message']>textarea")).sendKeys("Test message");
		
		browser.findElement(By.cssSelector("div input[class='wpcf7-form-control wpcf7-submit']")).click();
		
		WebElement thankYouText = browser.findElement(By.cssSelector("div [class='wpcf7-response-output']"));
		boolean thankYouTextPresent = thankYouText.equals(thankYouText);
		assertTrue(thankYouTextPresent, "Thank you for your message. It has been sent.");	
		
		
	
	}	
}
