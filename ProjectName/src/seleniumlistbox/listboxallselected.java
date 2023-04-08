package seleniumlistbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxallselected {
	public static void main (String []args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement r = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select Y = new Select(r);
		
	   List<WebElement> u = Y.getAllSelectedOptions();
		
		for(int i=0;i<=u.size()-1;i++) {
			System.out.println(u.get(i).getText());
		}
		
	}

}
