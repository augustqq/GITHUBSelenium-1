package newtabwindowhandles;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTabFunctionality {
	WebDriver driver;
	
  @Test
  public void newtabs() throws InterruptedException {
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	 Thread.sleep(3000);
	 
	// driver.switchTo().frame(2);
	 
	/* WebElement obj = driver.findElement(By.id("iframeResult"));
	 driver.switchTo().frame(obj); */
	 
	 driver.switchTo().frame("iframeResult");
 
	 driver.findElement(By.xpath("/html/body/button")).click();
	 
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	 
	 Thread.sleep(3000);
	 
	 driver.switchTo().defaultContent();
	 Thread.sleep(1000);
	 
	 driver.switchTo().parentFrame();
	 
	// driver.switchTo().parentFrame();
	 
	 driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();
	Thread.sleep(3000);
	
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo(). window(tabs.get(1));
	
	Thread.sleep(3000);

	
	driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[3]")).click();
	
	Thread.sleep(3000);
	
    driver.close();
	
	
	
//	driver.switchTo(). window(tabs.get(0));
    
    /** Browser Window Handles */
	
   Set<String> obj= driver.getWindowHandles();
   Object s[]=obj.toArray();
   driver.switchTo().window(s[1].toString());
	
  }
 
	 
	  
  
  
  @BeforeTest
  public void beforeTest() {
	 driver = new ChromeDriver(); 
	 driver.manage().window().maximize();
	  
  }

}
