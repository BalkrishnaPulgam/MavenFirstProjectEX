package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	WebDriver driver;
	
@Test
public void test01() {
	
	System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///E:/Selenium/Offline%20Website/Offline%20Website/index.html");
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
      }
}
