package iFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperties("");
		WebDriver driver   = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']")); 
		
	driver.switchTo().frame(iframe);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	driver.switchTo().defaultContent();
	//Thread.sleep(2000);
	
	driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	
	
	}
	

}
