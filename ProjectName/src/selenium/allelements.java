package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class allelements {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	
		WebElement area= driver.findElement(By.linkText("Places"));
	   area.click();
	   
	
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	
	 driver.get("https://www.facebook.com");
	
	 Thread.sleep(2000);
	
	// driver.findElement(By.id())
	
	
	
	
	
		
		
	}

}
