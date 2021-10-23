package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OperatorsPage {
	
	
	public OperatorsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
