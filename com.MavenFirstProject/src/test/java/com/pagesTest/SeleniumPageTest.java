package com.pagesTest;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.SeleniumPage;

public class SeleniumPageTest {
	
	static WebDriver driver;
	static SeleniumPage sl;
	static DashboardPage dp;
	
	@Test()
	public void test50(){
		
		sl=DashboardPageTest.dp.clickSelenmiumMoreInfo();
		
		ArrayList<String> tabs=new ArrayList<String>(LoginPageTest.driver.getWindowHandles());
		LoginPageTest.driver.switchTo().window(tabs.get(1));		
		Assert.assertEquals(LoginPageTest.driver.getTitle(), "Java by Kiran");
		
	}

}
