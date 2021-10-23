package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage {
	
	public SeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
