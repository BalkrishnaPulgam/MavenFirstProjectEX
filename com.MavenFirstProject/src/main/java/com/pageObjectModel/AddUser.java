package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser {
	
	@FindBy(id = "username")
	private WebElement uname;
	
	@FindBy(id="mobile")
	private WebElement mob;
	
	@FindBy(id="email")
	private WebElement userEmail;
	
	

}
