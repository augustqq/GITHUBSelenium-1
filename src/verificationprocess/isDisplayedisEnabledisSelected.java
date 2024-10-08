package verificationprocess;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class isDisplayedisEnabledisSelected {
	WebDriver driver;
	
  @Test
  public void isDisplayedMethod() {
 driver.get("https://www.redmine.org/"); 
	 
  boolean sign = driver.findElement(By.xpath("//a[@class='login']")).isDisplayed();
	  
  if(sign==true)
  {
	  System.out.println("Sign in link is presented in top manu bar");
	  driver.findElement(By.xpath("//a[@class='login']")).click();
  }
  
  else
  {
	 System.out.println("Sign in link is Not presented in top menu bar "); 
  }
  
  }
  
  
  @Test
  public void isEnabledMethod() {
 driver.get("https://www.redmine.org/"); 
 driver.findElement(By.xpath("//a[@class='login']")).click();
	  
  boolean login = driver.findElement(By.xpath("//input[@id='username']")).isEnabled();
 
 if(login==true)
  
 {
	System.out.println("Login textfield is enabled to enter the username");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("techelarn.in");
	 
 }
 else
 {
	 System.out.println("Login textfield is Not enabled to enter the username"); 
 }
 
  }
  @Test
  public void isSelectedMethod() {
   driver.get("https://www.redmine.org/"); 
   driver.findElement(By.xpath("//a[@class='login']")).click();
   
   driver.findElement(By.xpath("//input[@id='autologin']")).click();

   boolean checkbox = driver.findElement(By.xpath("//input[@id='autologin']")).isSelected();
	if(checkbox==true)
	{
		System.out.println("Stay logged in check box is Selected");
	}
	else
	{
		System.out.println("Stay logged in check box is Not Selected");
	}
	
  }

@BeforeTest
  public void beforeTest() {
	 driver =  new ChromeDriver();
	 driver.manage().window().maximize();
	  
	  
  }

}
