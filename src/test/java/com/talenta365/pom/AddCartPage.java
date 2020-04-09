package com.talenta365.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCartPage extends Base {
	
	By seeOfferButton = By.id("see_offer_btn");
	By addToCartButton= By.cssSelector("button[name='save_to_cart']");
	By messageLocator= By.cssSelector("label[class='roboto-regular ng-binding']");
	
	public AddCartPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void add() throws InterruptedException {
		
		Thread.sleep(5000);
		click(seeOfferButton);
		Thread.sleep(5000);
		click(addToCartButton);
		Thread.sleep(2000);
		
	}

	public String registeredMessage() throws InterruptedException {
	
		Thread.sleep(2000);
		return getText(messageLocator);
	}

	
	
	
	
	
	

}
