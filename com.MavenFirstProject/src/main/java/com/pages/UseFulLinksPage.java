package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UseFulLinksPage {
	
	public UseFulLinksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
