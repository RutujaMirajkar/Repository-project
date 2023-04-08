package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popchild {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
	
		
  driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
	Set<String> id = driver.getWindowHandles();
		// use handels to get set<string> as return type with variable
	
	System.out.println(id);
	
	
 ArrayList<String>al= new ArrayList<String>(id) ;
	
	String child= al.get(1);// index wise child browser adress
	
	
//	driver.findElement(By.xpath("(//span[text()='Training'])[1]").
	driver.switchTo().window(child);
	

//	driver.switchTo().window(al.get(0));//browser
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	driver.switchTo().window(al.get(0));
	
  driver.findElement(By.xpath("(//input[@name='NewTab'])")).click();
	
	
	
		
		
	}

}
