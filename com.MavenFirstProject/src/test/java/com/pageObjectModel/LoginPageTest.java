package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageObjectModel.LoginPage;

public class LoginPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/Selenium/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
	}

	@Test
	public void test01() {
		LoginPage lp=new LoginPage(driver);
		lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
