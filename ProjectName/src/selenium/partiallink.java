package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink {
	public static void main(String[] args) {
		WebDriver driver= new  ChromeDriver();
	    
		driver.get("https://www.facebook.com/signup");
     
  WebElement r = driver.findElement(By.partialLinkText("and"));
           r.click();
  
  
		
	}

}
