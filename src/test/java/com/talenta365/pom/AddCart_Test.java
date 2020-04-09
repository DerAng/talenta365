package com.talenta365.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class AddCart_Test {

	private WebDriver driver;
	private AddCartPage addCart;

	@Before
	public void setUp() throws Exception {
		
		
		addCart= new AddCartPage(driver);
		driver= addCart.chromeDriverConnection();
		addCart.visit("https://www.advantageonlineshopping.com/#/");
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		addCart.add();
		assertEquals("(1 Item)", addCart.registeredMessage());
	}

}