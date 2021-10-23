package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pageObjectModel.HomePage;

public class HomePageTest {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
		driver.manage().window().maximize();

	}
	
	@Test
	public void userChecking() {
		HomePage a=new HomePage(driver);
		a.clickUserLink();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
