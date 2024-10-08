package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_8_TimeOut_Feature {
	
  WebDriver driver;
  
  @Test  
  public void method1() throws InterruptedException {
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("techlearn.in"); 
	 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]")).click();
	 driver.findElement(By.xpath("//span[@class=\"KYBKoe\"]")).click();
  }
  
  @Test  
  public void method2() throws InterruptedException {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium.dev"); 
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]")).click();
	  driver.findElement(By.xpath("//span[@class=\"KYBKoe\"]")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
