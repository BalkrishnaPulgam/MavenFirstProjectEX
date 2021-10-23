package com.tests;

import static org.testng.Assert.assertThrows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.ListenerEx;

@Listeners(ListenerEx.class)
public class DemoTest55 {

	WebDriver driver;

	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/Offline%20Website/Offline%20Website/index.html");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	@Test
	public void test02() {
		Assert.assertTrue(false);
	}

	@Test
	public void test03() {
		throw new SkipException("Skipping a Test");
	}

}
