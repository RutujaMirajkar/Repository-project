package Selenium_actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_n_drop_actionclass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	   
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement minus = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement destination = driver.findElement(By.xpath("(//ol[@align=\"center\"])[2]"));
	    
		Actions act = new Actions(driver);
		
		act.dragAndDrop(minus, destination).perform();
		
	//following is an optional method for drag and drop
		//act.moveToElement(minus).clickAndHold().moveToElement(destination).release().build().perform();
	
	
	}
}
	
	
