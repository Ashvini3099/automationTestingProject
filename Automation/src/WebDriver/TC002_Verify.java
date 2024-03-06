package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC002_Verify{
	public static void main(String[] args) throws Exception{
		System.setProperty("WebDriver.chrome.driver", "D:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		if(driver.getTitle().equals("OrangeHRM - New Level Of  HR Management ")) {
			System.out.println("Title Matched ");
		}
		else {
			System.out.println("Title not matched ");
		}
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
			
			if(driver.getTitle().equals("OrangeHRM")) {
				System.out.println("Title Matched");
				
			}
			else {
				System.out.println("Title Not matched");
			}
		driver.close();
	}
	
}