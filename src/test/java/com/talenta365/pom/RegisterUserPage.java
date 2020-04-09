package com.talenta365.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterUserPage extends Base {
	
	By registerLinkLocator = By.cssSelector("a[id='menuUserLink']");
	By registerPageLocator = By.xpath("//img[@src=\"../../css/images/logo.png\"]");
	By createAccount = By.linkText("CREATE NEW ACCOUNT");
	By userNameLocator= By.cssSelector("input[name='usernameRegisterPage']");
	By emailLocator= By.cssSelector("input[name='emailRegisterPage']");
	By passwordLocator= By.cssSelector("input[name='passwordRegisterPage']");
	By confirmPassword= By.cssSelector("input[name='confirm_passwordRegisterPage']");
	By checkLink= By.cssSelector("input[name='i_agree']");
	By registerBtnLocator= By.id("register_btnundefined");
	By messageLocator= By.cssSelector("span[class='hi-user containMiniTitle ng-binding']");
	
	
	public RegisterUserPage(WebDriver driver) {
		super(driver);
		
	}

	public void registerUser(int result) throws InterruptedException {
		Thread.sleep(5000);
		click(registerLinkLocator);
		Thread.sleep(2000);
		
		if (isDisplayed(registerPageLocator)) {
			
			click(createAccount);
			Thread.sleep(2000);
			type("prueba"+result, userNameLocator);
			type("prueba"+result+"@gmail.com", emailLocator);
			type("Prueba123", passwordLocator);
			type("Prueba123", confirmPassword);
			Thread.sleep(2000);
			click(checkLink);
			Thread.sleep(2000);
			click(registerBtnLocator);
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
