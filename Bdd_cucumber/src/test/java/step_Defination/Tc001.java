package step_Defination;

import io.cucumber.java.en.When;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Tc001 {
	
	public WebDriver driver;
	@Given("Launch browser")
	public void launch_browser() {
	   System.setProperty("webdriver.gecko.driver", "D:\\Web Drivers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
	   driver = new FirefoxDriver();
	}

	@Given("Login and Logout")
	public void login_and_Logout() throws Exception {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	}

	@When("click on add button")
	public void close_appliaction() {
		driver.findElement(By.xpath("//input[@value = 'Add']")).click();
		
		driver.close();
	
	}



}
