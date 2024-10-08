package tabtitleurlapptext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyTabTitlleURLApplicationText {
	WebDriver driver;
	
  
@Test
  public void verifyTabTitle() {
	  driver.get("https://www.google.com");
	  
	  String exptabtltle = "Google";
	  System.out.println("Expcted Tab title is : "+exptabtltle);
	  
	  String acttabtitle = driver.getTitle();
	  System.out.println("Expcted Tab title is : "+acttabtitle);
	  
	  Assert.assertEquals (acttabtitle,exptabtltle);
	  
  }
  
  

@Test
public void verifyApplicationURL() {
	  driver.get("https://www.google.com");
	  
	  String expurl = "google.com";
	  
	  String acturl = driver.getCurrentUrl();
	  
	 Assert.assertEquals(acturl,expurl ); 
}
	 @Test
	 public void verifyApplicationText() {
	 	  driver.get("https://www.google.com");
	 	  
         String expgetext = "Gmail";
         
         String actgtext = driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]")).getText();
	  
	     Assert.assertEquals(actgtext,expgetext);
         
         String expingtext = "Images";
         
         String actimgtext = driver.findElement(By.xpath("//a[@aria-label='Search for Images ']")).getText();
         
         Assert.assertEquals(actimgtext,expingtext);
                 
}
  @BeforeTest
  public void beforeTest() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
  }

}
