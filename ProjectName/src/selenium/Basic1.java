package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {
	//maximaize mini, new window, new tab
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/");
	     Thread.sleep(4000);
	     
	     driver.switchTo().newWindow(WindowType.TAB);//new tab
	     driver.get("https://www.flipkart.com/");
	     
	     driver.switchTo().newWindow(WindowType.WINDOW);//new window
	     driver.get("https://www.amazon.in/");
	     
	     driver.manage().window().maximize();//max
	     Thread.sleep(300);
        
	     driver.manage().window().minimize();//mini
	     Thread.sleep(700);
	    
	     driver.manage().window().maximize();
	     
	     

}
}
