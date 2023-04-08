package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/");
	     Thread.sleep(4000);
	     
	     driver.switchTo().newWindow(WindowType.TAB);
	     driver.get("https://www.flipkart.com/");
	     
	     driver.switchTo().newWindow(WindowType.TAB);
	     driver.get("http://www.youtube.com/");
	     
	     driver.get("https://www.facebook.com/");
	     Thread.sleep(3000);
	     driver.switchTo().newWindow(WindowType.WINDOW);//open new window
	     driver.get("https://www.instagram.com");
	     Thread.sleep(4000);
         
	     driver.navigate().back();//expected flipkart but it refresh here itself
	     Thread.sleep(3000);
	     driver.navigate().forward();
	     Thread.sleep(3000);
	     driver.navigate().refresh();
	     
	     
	     

}}
