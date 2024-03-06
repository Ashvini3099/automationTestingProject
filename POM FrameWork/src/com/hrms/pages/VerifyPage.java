package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass
{
	//Verify fun
	//Verify title
	public static void verifyTitle(String title) {
		if(driver.getTitle().equals(title)) {
			
		}
		else {
			Reporter.log("Title not matched");
			Reporter.log(driver.getTitle());
		}
	}

}
