package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			
	}
@Disabled
	@Test
	void idnameclassnamecssselector() throws InterruptedException {
		driver.get("http://.hyderabadreportcom/user");
		Thread.sleep(2000);
	
		driver.findElement(By.id("edit-name")).sendKeys("manu");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("abc");
		Thread.sleep(2000);

	}
	@Disabled
	@Test
	void idnameclassnamecssselector1() throws InterruptedException {
		driver.get("http://www.seleniumlearn.com/user");
		Thread.sleep(2000);
		
	driver.findElement(By.id("edit-name")).sendKeys("srinu");
	Thread.sleep(2000);
	
	driver.findElement(By.name("pass")).sendKeys("abc");
	Thread.sleep(2000);;
	driver.findElement(By.id("edit-captcha-response")).sendKeys("10");
	Thread.sleep(2000);
	
//	driver.findElement(By.cssSelector("#edit-submit")).click();
//	driver.findElement(By.cssSelector("input#edit-submit")).click();
	driver.findElement(By.cssSelector(".form-submit")).click();
	
	

}
	@Disabled
	@Test
	void linktextpartiallinktext() throws InterruptedException {
		driver.get("http://www.hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Telangana")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Greater News")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("News")).click();
	}	
	@Disabled
		@Test
		void tagname() throws InterruptedException {

			driver.get("http://www.ndtv.com");
			Thread.sleep(2000);
		
			List<WebElement> images = driver.findElements(By.tagName("img"));
			

			System.out.println("Total images on NDTV Application : "+images.size());
			
/*	List<WebElement> ndtvlinks = driver.findElements(By.tagName("a"));
  
			System.out.println(ndtvlinks.size());
		System.out.println("Total links on NDTV : "+ndtvlinks.size());*/
		
		}	
		
		
			@Test
			void xpath() throws InterruptedException {
				Thread.sleep(2000);
				driver.get("http://www.hyderabadreport.com/user");
				Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("techlearn");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("manu");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}