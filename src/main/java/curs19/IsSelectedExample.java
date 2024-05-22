package curs19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class IsSelectedExample extends BaseTest{
	
	/*
	 * isSelected() --> functioneaza doar pe elemente de tip input care au
	 * atributul type=chckbox sau type = radio
	 * 
	 * daca nu au acest atribut isSelected() intoarce false
	 * 
	 */
	
	@Test
	public void isSelected() {
		
		browser.findElement(By.cssSelector("li[class='menu_user_login']>a")).click();
		
		WebElement passfield = browser.findElement(By.cssSelector("input[type='password']"));
		
		System.out.println(passfield.isSelected());
		
		System.out.println("-----------------------------------------------------------------");
		
		passfield.click();
		
		System.out.println(passfield.isSelected());
		
		System.out.println("-----------------------------------------------------------------");
		
		WebElement checkbox = browser.findElement(By.cssSelector("input[type='checkbox']"));
		
		System.out.println(checkbox.isSelected());
		
		System.out.println("-----------------------------------------------------------------");
		
		checkbox.click();
		
		System.out.println(checkbox.isSelected());
		
	}

}
