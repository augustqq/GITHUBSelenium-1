package fileupload;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class UploadFile {
	WebDriver driver;
  @Test
  public void attchfile () throws InterruptedException {
	  driver.get("https://www.gangaaram-tech.com/registration/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//textarea[@id='textarea-23104650921']")).sendKeys("Hello Text Message");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"field-ioa3T81OSsEXwhP\"]")).sendKeys("");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
