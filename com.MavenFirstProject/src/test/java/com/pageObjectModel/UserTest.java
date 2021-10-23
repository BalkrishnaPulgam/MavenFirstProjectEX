package com.pageObjectModel;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pageObjectModel.UserPage;

public class UserTest {

	WebDriver driver;

	@BeforeClass
	public void setEnvironment() {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/Offline%20Website/Offline%20Website/pages/examples/users.html");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void VerifyAddUserTitle() {
		UserPage b = new UserPage(driver);
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		b.clickAddUser();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Add User");

	}

	@Test(priority = 0)
	public void VerifyFooterLinkTitle() {
		UserPage a = new UserPage(driver);
		a.clickFooterText(driver);
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Assert.assertEquals(driver.getTitle(), "Java Classes in Pune | Selenium Training | Python Courses in pune");
	}

	@Test(priority = 2, description = "Verify title after clicking logout button")
	public void VerifyTitle() {
		UserPage c = new UserPage(driver);
		c.clickLogout();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
