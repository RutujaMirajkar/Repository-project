package dropdown;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropflipkart {
	 public static void main(String[] args) {
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		 // close the popup
		 
		WebElement login = driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));// login xpath
		 
		 Actions act = new Actions(driver);
		 //action class object 
		 
		 act.moveToElement(login).perform();
		 //to perform the mouse action
		 
		Object order = driver.findElement(By.xpath("//div[text()='Orders"));
		 
		 act.moveToElement(login)
		
		
	}

}
