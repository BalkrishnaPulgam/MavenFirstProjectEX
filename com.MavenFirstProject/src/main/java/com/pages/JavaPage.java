package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JavaPage {
	
	public JavaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
