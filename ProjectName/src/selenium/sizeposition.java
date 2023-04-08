package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeposition {
	
	public static <dimension> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/");
	     Thread.sleep(4000);
	     
	     Dimension d=new Dimension(300,400);
	     driver.manage().window().setSize(d);// dimension will get cHANGE AND
     // THEN NEXT STEP WILL HAPPEN THAT IS IN SAMLL DIMENSION  NEXT WINDOW WILL OPEN 
//	     
//	     driver.switchTo().newWindow(WindowType.TAB);
//	     driver.get("https://www.flipkart.com/");
//	      
//	     driver.switchTo().newWindow(WindowType.WINDOW);
//	     driver.get("https://www.instagram.com/");
//	     
//	     Dimension f= new Dimension(400,500);
//	     driver.manage().window().setSize(f);
//	     
	     Point p = new Point(100,200);
         driver.manage().window().setPosition(p);
         
         System.out.println(driver.manage().window().getSize());
        // driver.manage().window().maximize();
         
         System.out.println(driver.manage().window().getPosition());
         

}


	}
