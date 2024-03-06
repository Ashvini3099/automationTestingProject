package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {
	//driver
	public static WebDriver driver;
	//open app
	public static void openApplication() {
		System.setProperty("webdriver.gecko.driver", "D:\\Web Drivers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application open");
		
	}
	//close application
	public static void closeApplication() {
		
	}

}
