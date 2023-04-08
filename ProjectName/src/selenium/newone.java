package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newone {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
	//driver.close();
		//driver.quit();
		
		String title = driver.getTitle();//gettitle gives titlename 
		System.out.println(title);// name is printed
		
		
		String exptitle = "YouTube";// exptitle is a refrence variable 
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.flipkart.com");// get new window on previous new tab
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		if(title.equalsIgnoreCase(exptitle)) {//equalsignorecase return the 
			//true or false evenis there is case sensitive it ignore the upper 
			//and lowercase
			System.out.println("Navigate to correct page");
		}
		else {
			System.out.println("Navigate to invalid page");
		}
		
		
		
		
		
		
		
	}
}