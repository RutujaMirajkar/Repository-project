package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementfind {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/");
	     Thread.sleep(4000);
	     
	     driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("9970583436");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("developedindia");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	     
}
}
