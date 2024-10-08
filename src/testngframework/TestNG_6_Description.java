package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_6_Description {
	WebDriver driver;
	
  @Test(description="Verify Selenium application")
  public void TestCase1() {
	  driver.get("https://www.selenium.dev");
  }
  
  @Test(description="Verify twitter application")
  public void TestCase2() {
	  driver.get("www.x.com");
  }
  
  @Test(description="Verify facebook application")
  public void TestCase3() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test(description="Verify gmail application")
  public void TestCase4() {
	  driver.get("www.gmail.com");
  }
  
  @Test(description="Verify redmine application")
  public void TestCase5() {
	  driver.get("www.redmine.org");
  }
  
  @Test(description="Verify google application")
  public void TestCase6() {
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
