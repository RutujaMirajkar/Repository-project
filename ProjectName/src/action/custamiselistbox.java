package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class custamiselistbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty(null, null)
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		Actions act = new Actions(driver);
		act.contextClick();
		//how to pause the screen and get element of login dropdown
		// to debug the screen because screen is not stable while we select
		//an option in list
		
	}

}
