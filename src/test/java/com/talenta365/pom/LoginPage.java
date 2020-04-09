package com.talenta365.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  extends Base{
	
	By registerLinkLocator = By.cssSelector("a[id='menuUserLink']");
	By registerPageLocator = By.xpath("//img[@src=\"../../css/images/logo.png\"]");
	By userNameLocator= By.cssSelector("input[name='username']");
	By passwordLocator= By.cssSelector("input[name='password']");
	By buttonLocator = By.id("sign_in_btnundefined");
	By messageLocator= By.cssSelector("span[class='hi-user containMiniTitle ng-binding']");

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void login() throws InterruptedException {
		Thread.sleep(5000);
		click(registerLinkLocator);
		Thread.sleep(2000);
		
		if (isDisplayed(registerPageLocator)) {
			
			
			type("prueba6", userNameLocator);
			type("Prueba123", passwordLocator);
			
			click(buttonLocator);
			Thread.sleep(5000);
		}
		else {
			System.out.println("Register pages was not foud");
		}
		
	}

	
	public String registeredMessage() throws InterruptedException {
		Thread.sleep(2000);
		return getText(messageLocator);
	}
	
	

}
