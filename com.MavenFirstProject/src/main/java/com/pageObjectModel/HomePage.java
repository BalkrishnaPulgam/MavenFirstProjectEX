package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//*[contains(text(),'Users')]")
	private WebElement userlink;

	@FindBy(xpath = "//*[contains(text(),'Operators')]")
	private WebElement operatorslink;

	@FindBy(linkText = "Useful Links")
	private WebElement usefullink;

	@FindBy(linkText = "Downloads")
	private WebElement downloadlink;

	@FindBy(linkText = "Logout")
	private WebElement logoutlink;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickUserLink() {
		userlink.click();
	}

	public void clickUsefulLink() {
		usefullink.click();
	}

	public void clickdownloadLink() {
		downloadlink.click();
	}

	public void clickLogoutLink() {
		logoutlink.click();
	}

}
