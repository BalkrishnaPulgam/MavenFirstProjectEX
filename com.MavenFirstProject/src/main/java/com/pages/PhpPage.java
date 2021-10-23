package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PhpPage {
	
	public PhpPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
