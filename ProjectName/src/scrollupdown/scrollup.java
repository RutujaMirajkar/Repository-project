package scrollupdown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollup {
	public static void main (String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drievr", "C:\\\\Users\\\\rutuja\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.album.alexflueras.ro/index.php");
		Thread.sleep(1000);
	
	    JavascriptExecutor scroll =(JavascriptExecutor)driver;
	    scroll.executeScript("window.scrollBy(0, 3000)");
	    Thread.sleep(3000);
	    scroll.executeScript("window.scrollBy(0, -3000)");
	    Thread.sleep(3000);
	    scroll.executeScript("window.scrollBy(3000, 0)");
	    Thread.sleep(3000);
	    scroll.executeScript("window.scrollBy(-3000, 0)");
	    Thread.sleep(3000);
	
	
	}

}

