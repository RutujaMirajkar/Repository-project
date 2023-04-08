package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public interface Takescreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();// to open the browser
		
		driver.get("https://www.facebook.com/");//to open url
		
		//webdriver we need to typecast driver object into takescreenshot
		
		
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//need to call getScreenshot  method in which we give argument as outputtype.file
		
		//source is reference variable takescreenshot is a interface driver os reference of
		// webdriver above
		
		
		File destination = new File ("C:\\Users\\rutuja\\Pictures\\autoscreenshot\\ScreenBasic.jpg");
		
		FileHandler.copy(Source, destination);
		
	}
	

}
