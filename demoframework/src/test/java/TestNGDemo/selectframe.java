package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectframe {
	public static String url="https://the-internet.herokuapp.com/nested_frames";
	WebDriver driver;
	@BeforeTest
	public void Test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test()
	public void Test1() throws InterruptedException
	{
		driver.findElements(By.tagName("farmset")).size();
		
		System.out.println(driver.findElements(By.tagName("farmset")).size());
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='frame-top']")));
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText());
	       driver.close();
	}
		
		

}
