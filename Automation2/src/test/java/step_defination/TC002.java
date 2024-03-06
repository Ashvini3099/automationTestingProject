package step_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TC002 {
	
	public WebDriver driver;
	@Given("Open application")
	public void open_application() {
		
	    System.setProperty("webdriver.gecko.driver", "D:\\Web Drivers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	    
	}

	@Then("Enter username & Password")
	public void enter_username_Password() {
	    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	}

	@Then("Click on submit button")
	public void click_on_submit_button() {
	driver.findElement(By.name("Submit")).click();
	}

	@Then("click on Add button")
	public void click_on_Add_button() {
	 driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
	}




}
