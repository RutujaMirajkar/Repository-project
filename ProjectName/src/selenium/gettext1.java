package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext1 {
	 
	public static void main(String[] args) {
   
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
	 WebElement text = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
	 String result = text.getText();
	 System.out.println(result);
		
	
		
	}

}
