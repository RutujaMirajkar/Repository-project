package action;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickperbuild {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe" ); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html"); 
		
		WebElement source = driver.findElement(By.xpath("//a[@class=\"button button-orange\"][1]"));
		
	WebElement destination = driver.findElement(By.xpath("//li[@class='placeholder']"));	
	 Thread.sleep(2000);
		 
	 Actions act = new Actions(driver);
	 
	 Thread.sleep(3000);
	 
	 //act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
	 
	 act.dragAndDrop(source, destination).perform();
	 
		
	}

}
