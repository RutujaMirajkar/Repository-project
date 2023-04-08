package seleniumlistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox2 {
	
	public static void main (String [] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement r = driver.findElement(By.xpath("//select[@title=\"Month\"]"));
		
		Select S = new Select(r);
		
		S.selectByValue("8");
		
		
		System.out.println(S.getFirstSelectedOption().getText());
		
	}

}
