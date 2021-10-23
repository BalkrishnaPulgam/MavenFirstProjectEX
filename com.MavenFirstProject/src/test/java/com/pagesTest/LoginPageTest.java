package com.pagesTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginPageTest {

	static WebDriver driver;
	 LoginPage lp;
	static DashboardPage dp;

	private Logger log = Logger.getLogger(LoginPageTest.class);

	@BeforeSuite
	public void SetEnvironment() {
		log.warn("User should use valid driver file");
		log.info("opeining a new chrome browser");
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
	}

	@Test
	public void test01() {
		lp.invalid("kiran11@gmail.com", "123456789");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	@Test
	public void test02() {
		dp = lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}

}
