package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_Login {
	public static void main(String[] args) throws Exception{
		
		System.setProperty("WebDriver.chrome.driver", "D:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
//		driver.findElement(By.tagName('a'));
		Thread.sleep(3000);
		
		driver.findElement(By.name("Submit")).click();
		driver.close();
	}

}
