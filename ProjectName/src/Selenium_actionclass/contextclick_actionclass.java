package Selenium_actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick_actionclass {// right click
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		
		WebElement rutu = driver.findElement(By.xpath("//img[@loading=\"lazy\"]"));
		
		
		Actions drp= new Actions(driver);
		
		drp.contextClick(rutu).perform();
		
		
	}

}
