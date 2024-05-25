package Homework_MavenProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class Homework_c17_1 extends BaseTest{
	
	 @Test
     public void loginTestLocatorChecking() throws InterruptedException {
 
          WebElement loginLink = browser.findElement(By.linkText("Login"));
          assertEquals(loginLink.getText(), "Login");
         
          WebElement discoverLogin = browser.findElement(By.id("log"));
          WebElement discoverPassword = browser.findElement(By.id("password"));
         
          //verificam ca nu sunt vizibile inainte de click
          assertFalse(discoverLogin.isDisplayed());
          assertFalse(discoverPassword.isDisplayed());
          
          //deschidem login pop up
          loginLink.click();
          
          Thread.sleep(1000);
         
          //verificam ca sunt vizibile dupa ce deschidem login pop up
          assertTrue(discoverLogin.isDisplayed());
          assertTrue(discoverPassword.isDisplayed());
         
     }
	
}
	
