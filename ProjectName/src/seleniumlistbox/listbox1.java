package seleniumlistbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
	WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select S= new Select(year);// select class constructor call

//		List<WebElement> R = S.getOptions();
//		
//		int p = R.size();
//		
//		System.out.println(p);
//		
//		for(int i=0;i<=R.size()-1;i++) {
//			System.out.println(R.get(i).getText());
//		}
		
		String q = year.getText();
		
		System.out.println(q);
		
	
	}}
