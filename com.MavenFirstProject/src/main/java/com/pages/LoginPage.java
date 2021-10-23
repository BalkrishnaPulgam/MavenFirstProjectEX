package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public DashboardPage validLogin() {
		uname.clear();
		pass.clear();
		uname.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		loginButton.click();
		return new DashboardPage(driver);
	}
	
	public void invalid(String Uname, String Pass) {
		uname.sendKeys(Uname);
		pass.sendKeys(Pass);
		loginButton.click();
		
	}
	

}
