package Selenium_actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown_actionclass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		WebElement Login = driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
		
		Actions act =  new Actions(driver);//its action's
		
		act.moveToElement(Login).perform();//perform is compulsory
		
		Thread.sleep(2000);
		 WebElement Order = driver.findElement(By.xpath("//div[text()='Orders']"));
		//click by action class
		 
		 act.click(Order).perform();
		 
		 // to validate the url we give if else
		String get = driver.getCurrentUrl();
		
		if(get.equals("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders%3Flink%3Dhome_orders"))
		{
			System.out.println("True");
		}
		else 
    {
			System.out.println("False");
		}
	}
		
	}


