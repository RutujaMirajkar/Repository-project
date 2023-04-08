package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class impliweight {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuja\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();//upcasting
	
	driver.get("https://www.facebook.com/");
    //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//deprecated method
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// instruct to wait when we know how much time 
    //browser needs to load webpg   (for whole pg)
    
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9970583436");
    
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9970583436");
    
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rutuja@123");
    
    driver.findElement(By.xpath("//button[@value='1']")).click();
    
    
}

}
