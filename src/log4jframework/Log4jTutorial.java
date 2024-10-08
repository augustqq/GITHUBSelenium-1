package log4jframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jTutorial {
	WebDriver driver;
	
  @Test
  public void googlesearch() {
	  driver = new ChromeDriver();
	  System.out.println("Google chrome browser launched");
	  driver.manage().window().maximize();
	  System.out.println("Browser window maximized");
  }
}
