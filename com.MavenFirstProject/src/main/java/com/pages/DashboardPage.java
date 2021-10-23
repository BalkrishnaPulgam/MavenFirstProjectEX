package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;

	@FindBy(tagName = "h3")
	private List<WebElement> courses;

	@FindBy(xpath = "//div[@class='inner']//p")
	private List<WebElement> coursesName;

	@FindBy(xpath = "//span[text()='Users']")
	private WebElement userlink;

	@FindBy(xpath = "//span[text()='Operators']")
	private WebElement operatorslink;

	@FindBy(xpath = "//span[contains(text(),'Useful Links')]")
	private WebElement usefullinks;

	@FindBy(xpath = "//span[text()='Downloads']")
	private WebElement downloadlink;

	@FindBy(linkText = "Logout")
	private WebElement logoutlink;

	@FindBy(xpath = "//h3[text()='Selenium']//parent::div//following-sibling::a")
	private WebElement seleniumMoreInfo;

	@FindBy(xpath = "//h3[text()='Java / J2EE']//parent::div//following-sibling::a")
	private WebElement JavaMoreInfo;

	@FindBy(xpath = "//h3[text()='Python']//parent::div//following-sibling::a")
	private WebElement pythonMoreInfo;

	@FindBy(xpath = "//h3[text()='Php']//parent::div//following-sibling::a")
	private WebElement phpMoreInfo;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public UserPage clickUserLink() {
		userlink.click();
		return new UserPage(driver);
	}

	public OperatorsPage clickOperatorsLink() {
		operatorslink.click();
		return new OperatorsPage(driver);
	}

	public UseFulLinksPage clickUsefulLinks() {
		usefullinks.click();
		return new UseFulLinksPage(driver);
	}

	public DownloadLinkPage clickDownloadLink() {
		downloadlink.click();
		return new DownloadLinkPage(driver);
	}

	public LogoutLinkPage clickLogOutlink() {
		logoutlink.click();
		return new LogoutLinkPage(driver);
	}

	public SeleniumPage clickSelenmiumMoreInfo() {
		seleniumMoreInfo.click();
		return new SeleniumPage(driver);
	}

	public JavaPage clickJavaMoreInfo() {
		return new JavaPage(driver);
	}

	public PythonPage pythonMoreInfo() {
		pythonMoreInfo.click();
		return new PythonPage(driver);
	}

	public PhpPage phpMoreInfo() {
		phpMoreInfo.click();
		return new PhpPage(driver);
	}

	public ArrayList<String> verifyCourses() {
		ArrayList<String> actualCourseNames = new ArrayList<String>();
		for (WebElement course : courses) {
			String text = course.getText();
			actualCourseNames.add(text);
		}
		return actualCourseNames;
	}

	public ArrayList<String> verifyCoursesName() {
		ArrayList<String> actualCourseName1 = new ArrayList<String>();
		for (WebElement name : coursesName) {
			String text = name.getText();
			actualCourseName1.add(text);
		}
		return actualCourseName1;
	}

}
