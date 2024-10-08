package demotestng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GoogleSearch {
	 WebDriver driver;
	  
	  @Test  
	  public void searchtechlearn() throws InterruptedException {
		  driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("techlearn.in"); 
		 Thread.sleep(3000);
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  }
	  
	  @Test  
	  public void searchtestngxml () throws InterruptedException {
		  driver.get("https://www.google.com");
		  driver.findElement(By.name("q")).sendKeys("Selenium"); 
			 Thread.sleep(3000);
			 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }

}
