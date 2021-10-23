package com.pagesTest;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.AddUserPage;
import com.pages.UserPage;

public class UserPageTest {

	static WebDriver driver;
	static AddUserPage aup;
	static UserPage up;

	@Test
	public void test21() {
		ArrayList<String> expectedColumnNames = new ArrayList<String>();
		expectedColumnNames.add("#");
		expectedColumnNames.add("Username");
		expectedColumnNames.add("Email");
		expectedColumnNames.add("Mobile");
		expectedColumnNames.add("Course");
		expectedColumnNames.add("Gender");
		expectedColumnNames.add("State");
		expectedColumnNames.add("Action");
		Assert.assertEquals(DashboardPageTest.up.verifyCourseColumn(), expectedColumnNames);

	}

	@Test
	public void test22() {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		aup = DashboardPageTest.up.clickAddUser();
		Assert.assertEquals(LoginPageTest.driver.getTitle(), "JavaByKiran | Add User");
	}

}
