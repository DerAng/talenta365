package com.talenta365.pom;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Login_Test {

	private WebDriver driver;
	private LoginPage loginPage;

	@Before
	public void setUp() throws Exception {
		
		
		loginPage= new LoginPage(driver);
		driver= loginPage.chromeDriverConnection();
		loginPage.visit("https://www.advantageonlineshopping.com/#/");
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		loginPage.login();
		assertEquals("prueba6", loginPage.registeredMessage());
	}


}
