package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggest1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys("automation");
		
		Thread.sleep(3000);
		
		List<WebElement> text = driver.findElements(By.xpath("//div[@class=\"erkvQe\"]"));

	//	for(int i=0;i<=text.size();i++) {
	//		System.out.println(text.get(i).getText());
	//	}
		
		for(WebElement Eachoption:text) {
			System.out.println(Eachoption.getText());
		}
	}

}
