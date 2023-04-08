package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enabled {// to check if the button is working that is enabled 
	//it gives boolean result true or false 
	
	
	public static void main(String []args){
		
		//System.setProperty("", "");
		WebDriver driver= new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/login.");
		
		 WebElement loginbutton=driver.findElement(By.xpath("//button[@value=\"1\"]"));
		
		 boolean result =loginbutton.isEnabled();// login button is working that 
		 //is enabled
		 System.out.println(result);
		
		if (result) {
			System.out.println("the login  button is enabled");
			
		}
		else {
			System.out.println("login button is disabled");
			
		}
		
		
			
		}
		
	

}
