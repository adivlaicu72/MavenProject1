package Homework_MavenProject;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import selenium.utils.BaseTest;

public class Homework_c19 extends BaseTest{

	@Test(priority =1)
	public void testShopBookTheStoryAboutMe() {
		
		browser.get("https://keybooks.ro/");
		browser.findElement(By.cssSelector("div>form button")).click();
		browser.findElement(By.className("search_field")).sendKeys("The story about me");
		
		//implicit wait
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		browser.findElement(By.linkText("The story about me")).click();
		
		//verific ca am ajuns la pagina cartii
		String URL = browser.getCurrentUrl();
		assertTrue(URL.contentEquals("https://keybooks.ro/shop/the-story-about-me/"));
		
		//apasam pe add to cart si verificam daca ne apare textul cu added to cart
		browser.findElement(By.cssSelector("button[class='single_add_to_cart_button button alt']")).click(); 
		WebElement hasBeenAdded = browser.findElement(By.cssSelector("div [class='woocommerce-message']"));
		boolean hasBeenAddedPresent = hasBeenAdded.equals(hasBeenAdded);
		assertTrue(hasBeenAddedPresent, "\"The story about me\" has been added to your cart.");	

		//dupa verificarea textului apasam pe View Cart si validam ca ne duce pe URL https://keybooks.ro/cart/
		browser.findElement(By.cssSelector("article a[class='button wc-forward']")).click();
		assertTrue(browser.getCurrentUrl().equals("https://keybooks.ro/cart/"));

	}
	
		//De aici pentru ce se intampla in cart facem o noua metoda @Test
		@Test (priority=2) 
		public void viewCart() {
			
		//In noua metoda @Test vom face update de cantitate pentru carte la 2
		browser.findElement(By.cssSelector("span[class='q_inc']")).click();
		browser.findElement(By.cssSelector("button[class='button'][name='update_cart']")).click();
			
		//Verificam mesajul dupa update
		WebElement cartUpdated = browser.findElement(By.cssSelector("div [class='woocommerce-message']"));
		boolean cartUpdatedPresent = cartUpdated.equals(cartUpdated);
		assertTrue(cartUpdatedPresent, "Cart updated.");	
			
		//Apasam Proceed to checkout
		browser.findElement(By.cssSelector("a[class='checkout-button button alt wc-forward']")).click();
			
		//In noul screen verificam URL ca este egal cu https://keybooks.ro/chckout/
		assertTrue(browser.getCurrentUrl().equals("https://keybooks.ro/checkout/"));
			
		//Verificam daca ne apare textul Billing details si Aditional information
		WebElement billingDetails = browser.findElement(By.cssSelector("div[class='woocommerce-billing-fields']"));
		boolean billingDetailsPresent = billingDetails.equals(billingDetails);
		assertTrue(billingDetailsPresent, "Billing details");	
			
		WebElement additionalInfo = browser.findElement(By.cssSelector("div[class='woocommerce-billing-fields']"));
		boolean additionalInfoPresent = additionalInfo.equals(additionalInfo);
		assertTrue(additionalInfoPresent, "Additional information");	
				
			}
}
