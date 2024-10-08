package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowsersLaunching { 
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.close();
		
	//	driver.quit();
		
	//	driver.manage().window().minimize();
		
	//	driver.manage().window().fullscreen();
		
		
	//	WebDriver driver = new ChromeDriver();
		
	//	ChromeDriver driver = new ChromeDriver();
		
	//	WebDriver driver = new FirefoxDriver();
		
	//	WebDriver driver = new EdgeDriver();
		
	//	WebDriver driver = new SafariDriver();
		
	//	WebDriver driver = new OperaDriver();
		
	}

}
