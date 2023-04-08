package selenium;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getatribute  {
	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver= new  ChromeDriver();
    
		driver.get("https://www.facebook.com/signup");
     
  WebElement r = driver.findElement(By.xpath("//input[@type=\"password\"]"));
   
   Object y = r.getAttribute("id");
   
   System.out.println(y);
	

}}
