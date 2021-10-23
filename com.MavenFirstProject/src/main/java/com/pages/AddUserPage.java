package com.pages;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddUserPage {
	static WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	private static WebElement username;

	@FindBy(xpath = "//input[@placeholder='Mobile']")
	private static WebElement mobile;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private static WebElement email;

	@FindBy(xpath = "//input[@placeholder='Java/J2EE']")
	private static WebElement coursesname;

	@FindBy(xpath = "//input[@value='Male']")
	private static WebElement genderMale;

	@FindBy(xpath = "//input[@value='Female']")
	private static WebElement genderFemale;

	@FindBy(xpath = "//select")
	private static WebElement select;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private static WebElement password;
	
	@FindBy(xpath="//span[text()='Cancel']")
	private static WebElement cancel;

	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement submit;

	public AddUserPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	public static UserPage clickUserLink() {
		cancel.click();
		return new UserPage(driver);
	}

	private static void selectStateByText(String text) {
		WebElement sel = LoginPage.driver.findElement(By.xpath("//select"));
		Select select = new Select(sel);
		select.selectByVisibleText(text);
	}

	private static void selectStateByValue(String value) {
		WebElement sel = LoginPage.driver.findElement(By.xpath("//select"));
		Select select = new Select(sel);
		select.selectByValue(value);
	}

	private static void selectStateByIndex(int index) {

		WebElement sel = LoginPage.driver.findElement(By.xpath("//select"));
		Select select = new Select(sel);
		select.selectByIndex(index);
	}

	public static void addnewuser() throws InterruptedException {
		username.sendKeys("Balkrishna");
		mobile.sendKeys("8482808639");
		email.sendKeys("pulgam@gmail.com");
		coursesname.sendKeys("Java");
		genderMale.click();
		// selectStateByIndex(1);
		selectStateByText("Maharashtra");
		Thread.sleep(3000);
		password.sendKeys("123456");
		Thread.sleep(3000);
		submit.click();

	}

	public static void compareDropdown(String locvalue) {

		String[] exp = { "--Select State--","Maharashtra", "Delhi", "HP", "Punjab" };
		List<String> expList = new ArrayList<String>();

		for (int i = 0; i < exp.length; i++) {
			expList.add(exp[i]);
		}

		List<String> actList = new ArrayList<String>();
		Select se = new Select(LoginPage.driver.findElement(By.xpath(locvalue)));

		List<WebElement> options = se.getOptions();

		for (WebElement dd : options) {
			actList.add(dd.getText());
		}
		
		Collections.sort(expList);
		Collections.sort(actList);
		
		if (expList.size() == actList.size()) {
			for (int i = 0; i < expList.size(); i++) {
			
				if (expList.get(i).equals(actList.get(i))) {
					System.out.println("Matched");
				} else {
					System.out.println("Not matched");
				}
			}
		} else {
			System.out.println("Drop down values are not same in number");
		}
		Assert.assertEquals(actList, expList);
	}
	
	
	
	public static void compareExcelDataWithDropDownOptions()  {
		 //READING DATA FROM EXCEL FROM 1ST COLUMN
		FileInputStream input=null;
		 HSSFWorkbook wb =null;
		try {
       input = new FileInputStream("D:\\sel.xls");
      
        wb = new HSSFWorkbook(input);
		}catch(Exception e) {
			e.printStackTrace();
		}
		 int count=0;
        HSSFSheet sh = wb.getSheet("sheet1");

          
        List<String> excelList = new ArrayList<String>();
        for (int i=0;i<=sh.getLastRowNum();i++)

          {
            HSSFRow row = sh.getRow(i);
            excelList.add(row.getCell(count).toString());
            
          } 
        
        List<String> actList = new ArrayList<String>();
		Select se = new Select(LoginPage.driver.findElement(By.xpath("//select")));

		List<WebElement> options = se.getOptions();

		for (WebElement dd : options) {
			actList.add(dd.getText());
		}
	
		Assert.assertEquals(excelList, actList);

	}

		
}
