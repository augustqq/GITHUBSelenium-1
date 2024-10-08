package google;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Search {
	WebDriver driver;
	
  @Test
  public void googlesearch() {
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")) .sendKeys("Maven Tool"+Keys.ENTER);
	
  }
  
  @Test
  public void googlesearchtech() {
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")) .sendKeys("techlearn"+Keys.ENTER);
	
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
