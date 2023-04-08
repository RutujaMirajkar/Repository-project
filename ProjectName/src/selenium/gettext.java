package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {// get text of all the paage print 
	
	
	public static void main(String[] raj) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		
		WebElement text= driver.findElement(By.xpath("//div[contains(@class,'_8esf ')]"));
		
				String result= text.getText();
				System.out.println(result);
		
		
		
		
	}}