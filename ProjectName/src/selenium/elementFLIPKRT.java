package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementFLIPKRT {// facebook
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/");
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//input[@aria-label=\"Email address or phone number\"]")).sendKeys("9970583436");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("rutuja@123");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button")).click();
	     

}}
