package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_2_TCs_Exe_Priority_Order {
	WebDriver driver;
  
  @Test  (priority=5)
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  
  @Test (priority=0)
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  
  @Test  (priority=4)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test (priority=1)
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  
  @Test  (priority=3)
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  
  @Test  (priority=2)
  public void google() {
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
