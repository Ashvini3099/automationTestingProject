package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Open_Multi_URL {
	public static void main(String[] args) throws Exception {
		System.setProperty("webDriver.chrome.driver", "D:\\Web Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.navigate().to("https://www.amazon.com/");
		 
        driver.navigate().back();
		  Thread.sleep(3000);
		 
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 
		 driver.navigate().back();
		  driver. close();
		 
	}

}
