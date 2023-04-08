package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic2 {//containtext

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//upcasting
		
  driver.get("https://www.instagram.com/");
  Thread.sleep(1000);
  
  driver.manage().window().maximize();
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
  // it gives the functn of the text whihch has functn. on instagram pg 
  //we have login in with fb it click on that
  //xpath by text
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("//input[contains(@class,'inputtext')[2]")).sendKeys("ajhdtfhj");

  //xpath by contains method and []index
  Thread.sleep(3000);
  
  driver.findElement(By.xpath("//input[contains(@type=\"text\")]")).sendKeys("jsgfshh");
  
}
}
