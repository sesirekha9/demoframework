package TestNGDemo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class annotationsTestNG {
	WebDriver driver;
	public String title;
	public String URL;
	
	@BeforeTest
	public void BT() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test (priority=0)
	public void apple() {
		title = driver.getTitle();
		Assert.assertEquals("sesi", "sesi");
 
	}
	@Test (priority=1)
	public void car() {
		URL = driver.getCurrentUrl();
		
	}
	@Test (priority=2)
	public void bat() {
		System.out.println(title + URL);
		
	}
	@Test (priority=3)
	public void tap() {
		System.out.println("sesi");
		
	}
	@AfterTest
	public void AT() {
		driver.close();
		
	}
	
	
	

}
