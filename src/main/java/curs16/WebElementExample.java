package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WebElementExample {

	WebDriver browser;
	
	@BeforeClass
	public void setup() {
		
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://keyfood.ro");
	}
	
	//@AfterClass
	public void tearDown() {
		browser.quit();
	}
	
	@Test
	public void login() {
		
		browser.findElement(By.linkText("My account")).click();
		
	}
	
	
}
