package com.hrms.lib;
  
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import  org.openqa.selenium.WebDriver ;
import org .openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TC001 {
	public WebDriver driver ;
	
	@BeforeClass
	public void login() {
		driver = new ChromeDriver();
		System.setProperty("WebDriver chrome.driver", "D:\\Web Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
	}
	@Test(priority=1,groups="Title")
	public void GooglegetTitle() {
//		
		String title =driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority = 2,groups = "Logo")
	public void googleLogo() {
		driver.findElement(By.name("btnK")).isDisplayed();
	   System.out.println(" Google Search is displayed");
	}
	
	@Test 
	public void maillinktest() {
		driver.findElement(By.linkText("mail")).isDisplayed();
		System.out.println("mail link displayed");
	}
	
	@Test 
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Test 
	public void Test2() {
		System.out.println("Test2");
	}
   @AfterClass
   public void TearDown() {
	   driver.quit();
   }

}
