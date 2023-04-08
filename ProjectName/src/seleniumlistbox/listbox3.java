package seleniumlistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox3 {
	private static final boolean True = false;

	public static void main (String []args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		 
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select D= new Select(day);
		
		boolean A = D.isMultiple();
		
		System.out.println(A);
		
	if (A == true) {
		
		System.out.println("multiple select");
		
		}
	else {
		System.out.println("is single selected");
	}
		
		
				
			
		
		
		
		
		
	}

}
