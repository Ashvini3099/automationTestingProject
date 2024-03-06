package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LoginPage extends BaseClass {
	//objects
	static By txt_loginname = By.name("txtUserName");
	static By txt_Password = By.name("txtPassword");
	static By btn_login   = By.name("Submit");
	
	//Function
	public static void login(String username,String password) 
	{
		driver.findElement(txt_loginname).sendKeys(username);
		driver.findElement(txt_Password).sendKeys(password);
		driver.findElement(btn_login).click();
		Reporter.log("login completed");
	}
			
	

}
