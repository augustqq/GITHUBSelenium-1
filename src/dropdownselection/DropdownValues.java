package dropdownselection;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropdownValues {
	WebDriver driver;
  @Test
  public void selectdropdownoptions() throws InterruptedException {
	  
	driver.get("https://www.redmine.org/account/register");  
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("techlearn.india@gmail.com");
	 Thread.sleep(3000);
	 new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByVisibleText("Italian (Italiano)");
	 
	// Select obj = new Select (driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	// obj.selectByIndex(7);
	// obj.selectByValue("ar");
	// obj.selectByVisibleText("German (Deutsch)");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
