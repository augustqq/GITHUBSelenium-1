package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_3_Skip_Ignore_Disabled {
	@SuppressWarnings("unused")
	private static final boolean enabled = false;
	WebDriver driver;
  
  @Test  (priority=5)
  public void selenium() {
	  driver.get("www.selenium.dev");
  }
  
  @Test (priority=0)
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  
  @Test  (enabled=false )
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test (priority=1)
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  
  @Test  (priority=3)
  public void redmine() {
	  driver.get("www.redmine.org");
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
