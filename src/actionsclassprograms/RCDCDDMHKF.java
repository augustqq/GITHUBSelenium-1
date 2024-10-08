package actionsclassprograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RCDCDDMHKF {
	
	WebDriver driver;
	
  @Test
  public void rightclick() throws Exception {
	  driver.get("http://seleniumlearn.com/");
	  Thread.sleep(3000);
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//a[normalize-space()='Jenkins']"))).build().perform();
	  
  }
  
  @Test
  public void doubleclick() throws Exception {
	  driver.get("http://seleniumlearn.com/double-click");
	  Thread.sleep(3000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("scroll(0, 500)"); 
      Thread.sleep(3000);

	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Techlearn.in']"))).doubleClick().build().perform();

	 // act.doubleClick(driver.findElement(By.xpath("//button[normalize-space()='Techlearn.in']"))).build().perform();
	  
  }
  
  @Test
  public void dragandrop() throws Exception {
	  driver.get("http://seleniumlearn.com/drag-and-drop-html");
	  Thread.sleep(5000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("scroll(0, 500)"); 
      Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  
	 WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	 WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
	 
	 act.dragAndDrop(source, target).build().perform();
	 
  }
  
  @Test
  public void mousehover() throws Exception {
	  driver.get("http://seleniumlearn.com/");
	  Thread.sleep(5000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[@href='/selenium']"))).build().perform();
	  Thread.sleep(5000);
	  act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Selenium Quiz']"))).click().build().perform();
	 driver.findElement(By.xpath("//a[normalize-space()='Selenium Quiz']")).click();
  }
  
  @Test
  public void keyboardfunctions () throws Exception {
	  driver.get("http://www.redmine.org/");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  Thread.sleep(3000);

	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.ENTER).build().perform();
	  
	  
	  
	  
	  

  }
@BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
