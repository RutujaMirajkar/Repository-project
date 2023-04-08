package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.tagName("//meta"));
		// we can use tagname only when multipe tagname present
		//we can not use duplicate tagnam 
		// we can not use index for tagname 
		
		
		
		
		
		
		
		
	}

}
