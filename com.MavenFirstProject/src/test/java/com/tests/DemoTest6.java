package com.tests;

import static org.testng.Assert.assertThrows;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.ListenerEx;


public class DemoTest6 {

	WebDriver driver;
	private Logger log=Logger.getLogger(DemoTest6.class);

	@Test
	public void test01() {
		log.info("opening a browser");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/Offline%20Website/Offline%20Website/index.html");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	@Test
	public void test02() {
		log.info("inside test2");
		Assert.assertTrue(false);
	}

	@Test
	public void test03() {
		log.info("inside test3");
		throw new SkipException("Skipping a Test");
	}
}
