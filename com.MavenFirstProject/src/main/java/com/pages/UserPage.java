package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	WebDriver driver;
	@FindBy(xpath = "//button[text()='Add User']")
	private WebElement addUserButton;
	
	@FindBy(tagName="th")
	private List<WebElement> userListColumnName;
	
	@FindBy(xpath="//td[text()='1'] //following-sibling::td//span[text()='Delete']")
	private WebElement Delete;
	
	
	public UserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public AddUserPage clickAddUser() {
		addUserButton.click();
		return new AddUserPage(driver);
		
	}
	
	public ArrayList<String> verifyCourseColumn(){
		ArrayList<String> actualColumnNames=new ArrayList<String>();
		for (WebElement ListColumnName : userListColumnName) {
			String text=ListColumnName.getText();
			System.out.println(ListColumnName.getText());
			actualColumnNames.add(text);
		}
		return actualColumnNames;
	}
}
