package com.pageObjectModel;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.java.swing.plaf.windows.resources.windows;

public class UserPage {
	

	@FindBy(xpath = "//button[text()='Add User']")
	private WebElement addUser;

	@FindBy(partialLinkText = "LOGOUT")
	private WebElement logoutTopCornerlink;

	@FindBy(linkText ="JavaByKiran")
	private WebElement FooterText;

	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickAddUser() {
		addUser.click();
	}

	public void clickLogout() {
		logoutTopCornerlink.click();
	}

	public void clickFooterText(WebDriver driver) {
		
		Actions action =new Actions(driver);
		action.moveToElement(FooterText).click().perform();
		
		
	}

}
