package Homework_MavenProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class Homework_c17_2 extends BaseTest{
	
	@Test
	public void findTheForestBook() throws InterruptedException{
		List<WebElement> menuOptions = browser.findElements(By.className("sc_tabs_title"));
		System.out.println(menuOptions.size());

		//in for dam click pe fiecare tab si trebuie sa identificam cartea             
		//si sa verificam daca exista (metoda isDisplayed())
		
		for(WebElement element : menuOptions) {
		      //gasim cartea
		      WebElement forestBook = browser.findElement(By.cssSelector("div[aria-hidden='false'] a[href='the-forest']")); 
		      Thread.sleep(1000);
		      //dau click pe fiecare element din meniu
		      element.click();
		      //verific daca cartea exista
		      assertTrue(forestBook.isDisplayed());	      
		      }
	
		Thread.sleep(1000);
		browser.findElement(By.cssSelector("div[aria-hidden='false'] a[href='the-forest']")).click();  
		
		//verific url ca este url cartii 
		assertEquals(browser.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
		
	}

	
}
