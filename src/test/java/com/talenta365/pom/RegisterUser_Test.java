package com.talenta365.pom;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegisterUser_Test {
	
	private WebDriver driver;
	private RegisterUserPage registerUser;

	@Before
	public void setUp() throws Exception {
		
		
		registerUser= new RegisterUserPage(driver);
		driver= registerUser.chromeDriverConnection();
		registerUser.visit("https://www.advantageonlineshopping.com/#/");
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		Random r = new Random(); 
		int result = r.nextInt(10000-1000) + 1000;
		registerUser.registerUser(result);
		assertEquals("prueba"+result, registerUser.registeredMessage());
		Thread.sleep(2000);
	}

}
