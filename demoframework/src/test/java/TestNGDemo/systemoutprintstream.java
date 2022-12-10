package TestNGDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class systemoutprintstream {
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
	public void Test1() throws InterruptedException, FileNotFoundException
	{
		driver.findElements(By.tagName("farmset")).size();
		
		System.out.println(driver.findElements(By.tagName("farmset")).size());
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='frame-top']")));
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText());
		PrintStream ps = new PrintStream(new File("/Users/Admin/Desktop/selenium/console.txt"));
			 System.setOut(ps);
			 ps.print(driver.findElement(By.xpath("//*[@id='content']")).getText());
	    
	}
		
		

}



