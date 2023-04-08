package Webelement;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	    
		Thread.sleep(1000);
		
	    List<WebElement> no0fRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(no0fRows.size());
		
		List<WebElement> noOfCell = driver.findElements(By.xpath("//table[@id='Country']//tr[\\\"+(i+1)+\\\"]//td"));
		System.out.println(noOfCell.size());
		
		
		
	
	}
}
