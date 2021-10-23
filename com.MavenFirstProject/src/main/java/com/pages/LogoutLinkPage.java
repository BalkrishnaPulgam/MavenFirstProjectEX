package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogoutLinkPage {
	
	public LogoutLinkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
