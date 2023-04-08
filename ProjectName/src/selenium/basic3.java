package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic3 {//to see if the element is displayed or not 
	 //means in  gender the custumgender to gender optional check if does display or not 

	
	//is displayed(); used 
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//upcasting
		
		
		
		driver.get("https://www.facebook.com/reg");
 
		WebElement cotemGen = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
		
		
		boolean result = cotemGen.isDisplayed();
		System.out.println(result);
		
		
		
		
}}
