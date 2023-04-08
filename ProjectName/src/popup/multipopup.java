package popup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		//Thread.sleep(3000);
	//driver.findElement(By.xpath("//span[text()='Training']")).click();
		 
		
		Set<String> ID = driver.getWindowHandles();
	
		ArrayList<String> al = new ArrayList<String>(ID);
		
		
		
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		 
		
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		Set<String> YD = driver.getWindowHandles();
		ArrayList<String> RD = new ArrayList<String>(YD);
		
		driver.switchTo().window(RD.get(2));
		driver.findElement(By.xpath("//span[text()='TechStuff']")).click();
		//driver.switchTo().
		
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		 
		
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		
		
		
	}

}
