package iframesinselenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HandaleIframes {
	WebDriver driver;
	
  @Test
  public void frames() throws InterruptedException {
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
	 
  }
  @Test
  public void google() throws InterruptedException {
	 driver.get("https://www.google.com");
	 Thread.sleep(3000); 
	 driver.switchTo().frame(5);
	 //org.openqa.selenium.NoSuchFrameException: no such frame - In Console Window
	 
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	 driver = new ChromeDriver(); 
	 driver.manage().window().maximize();
	  
  }

}
