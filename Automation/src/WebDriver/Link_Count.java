package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Count{
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "D:\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.manage().deleteAllCookies();
	    
	    driver.navigate().to("https://www.python.org/");
	   
//	    get the total count of link on the page 
	    
	    List <WebElement>  linklist = driver.findElements(By.tagName("a"));
	    System.out.println(linklist.size());
	    
	     

      for(int i = 0; i < linklist.size(); i++) {
    	  String linktext = linklist.get(i).getText();
    	  System.out.println(linktext);
      }
			driver.close();
			
		 }
	
	}
