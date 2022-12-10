package TestNGDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class annotationsjunit {
	WebDriver driver;
	public String title;
	public String URL;
	
	@Before
	public void BT() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("www.google.com");
	}
	@Test
	public void testcase1() {
		title = driver.getTitle();
		
	}
	@Test
	public void testcase2() {
		URL = driver.getCurrentUrl();
		
	}
	@Test
	public void testcase3() {
		System.out.println(title + URL);
		
	}
	@After
	public void AT() {
		driver.close();
		
	}
	
	
	

}
