package Selenium_actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown_actionclass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bollywoodhungama.com/celebrity/shahid-kapoor/photos/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor my = (JavascriptExecutor)driver ;
		//JavascriptExecutor is an interface used to perform action sccroll up and down
		// here the typecasting takes place within JavascriptExecutor and driver
		// here exching of method takes place with chrome driver
		
		my.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		my.executeScript("window.scrollBy(0,-450)");
	}

}
