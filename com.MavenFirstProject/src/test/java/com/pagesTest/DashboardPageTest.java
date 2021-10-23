package com.pagesTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.DownloadLinkPage;
import com.pages.LogoutLinkPage;
import com.pages.OperatorsPage;
import com.pages.SeleniumPage;
import com.pages.UseFulLinksPage;
import com.pages.UserPage;

public class DashboardPageTest {
	
	
	static WebDriver driver;
	static DashboardPage dp;
	static UserPage up;
	static UseFulLinksPage ufp;
	static OperatorsPage op;
	static DownloadLinkPage dpl;
	static LogoutLinkPage llp;
	static SeleniumPage sl;
	
	@Test
	public void test03() {
		ArrayList<String> expectedCourses=new ArrayList<String>();
		expectedCourses.add("Selenium");
		expectedCourses.add("Java / J2EE");
		expectedCourses.add("Python");
		expectedCourses.add("Php");
		Assert.assertEquals(LoginPageTest.dp.verifyCourses(),expectedCourses);
	}
	
	@Test
	public void test04() {
		ArrayList<String> courseName=new ArrayList<String>();
		courseName.add("Automation Testing");
		courseName.add("Software Development");
		courseName.add("Data Science");
		courseName.add("Web Development");
		Assert.assertEquals(LoginPageTest.dp.verifyCoursesName(), courseName);
	}
	/*
	@Test()
	public void test05() {
		
		sl=LoginPageTest.dp.clickSelenmiumMoreInfo();
		
		ArrayList<String> tabs=new ArrayList<String>(LoginPageTest.driver.getWindowHandles());
		LoginPageTest.driver.switchTo().window(tabs.get(1));
		LoginPageTest.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Assert.assertEquals(LoginPageTest.driver.getTitle(), "Java by Kiran");
		
	}*/
	
	
	@Test
	public void test06() {
		up=LoginPageTest.dp.clickUserLink();
		Assert.assertEquals(LoginPageTest.driver.getTitle(), "JavaByKiran | User");
	}

	/*
	@Test
	public void test06() {
		ufp=LoginPageTest.dp.clickUsefulLinks();
		Assert.assertEquals(LoginPageTest.driver.getTitle(), "JavaByKiran | Useful Links");
	}
	
	@Test
	public void test07() {
		op=LoginPageTest.dp.clickOperatorsLink();
		Assert.assertEquals(LoginPageTest.driver.getTitle(), "JavaByKiran | Operators");
	}
	
	@Test
	public void test08() {
		dpl=LoginPageTest.dp.clickDownloadLink();
		Assert.assertEquals(LoginPageTest.driver.getTitle(), "JavaByKiran | Downloads");
	}
	
	
	/*
	
	@Test
	public void test09() {
		llp=LoginPageTest.dp.clickLogOutlink();
		Assert.assertEquals(LoginPageTest.driver.getTitle(), "JavaByKiran | Log in");
	}
	
	*/
	
	
}
