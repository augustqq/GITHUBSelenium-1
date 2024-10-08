package alertwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopupAlerts {
	WebDriver driver;
	private Object alt;
	
  @Test
  public void alertwindowokbutton() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(4000);
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("scroll(0, 500)"); 
      
      Thread.sleep(4000);
      
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  
	  Thread.sleep(4000);
	  
	  driver.switchTo().alert().accept();
      
  
  
}

  @Test
  public void alertwindowCanclebutton() throws InterruptedException {
	  
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(4000);
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("scroll(0, 500)"); 
      
      Thread.sleep(4000);
      
      driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  
      Thread.sleep(4000);
	  driver.switchTo().alert().dismiss();
    
  }
  
  
  @Test
  public void alertwindowsendtextokCanclebutton() throws InterruptedException {
	  
	  driver.get("http://seleniumlearn.com/prompt-dialog-box ");
	  Thread.sleep(4000);
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("scroll(0, 500)"); 
      
      Thread.sleep(4000);
      driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
      Thread.sleep(4000);
      
      Alert alt = driver.switchTo().alert();
      alt.sendKeys("sravani");
      alt.accept();
      
  /*    driver.switchTo().alert().sendKeys("Usha");
      Thread.sleep(3000);
      
      driver.switchTo().alert().accept(); */
      
      
  }
  
  
  
  private Object Alert(Object alt2) {
	// TODO Auto-generated method stub
	return null;
}

@BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}


