package com.pagesTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjectModel.AddUser;
import com.pages.AddUserPage;
import com.pages.DashboardPage;
import com.pages.UserPage;

public class AddUserPageTest {

	static WebDriver driver;
	static DashboardPage dp;
	static AddUserPage aup;
	static UserPage up;

	@Test
	public void test33() throws InterruptedException {
		AddUserPage.addnewuser();
		String act = LoginPageTest.driver.switchTo().alert().getText();
		LoginPageTest.driver.switchTo().alert().accept();
		Assert.assertEquals(act, "User Added Successfully. You can not see added user.");
	}
	
	@Test
	public void test34() {
		AddUserPage.compareDropdown("//select");
	}
	
	@Test
	public void test35() {
		AddUserPage.compareExcelDataWithDropDownOptions();
	}

}
