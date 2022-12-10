package TestNGDemo;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class holidaystest  extends test_utils {
public  String url="https://www.makemytrip.com/";
	
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		
		WebDriverManager.firefoxdriver().setup();
		
		driver=new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void test() throws InterruptedException
	{
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Holiday Packages")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='fromCity']")).click();
		driver.findElement(By.xpath("//*[text()='Bangalore']")).click();
		
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//*[@class='dest-search-input']")).sendKeys("singapore");
		driver.findElement(By.xpath("//div[text()='Singapore']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-cy='submit']")).click();
			

	}
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='departure_date']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@aria-label='Thu Nov 12 2022']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@class='primaryBtn big fill btn btn-top-nav btn-lg']")).click();
		Thread.sleep(5000);
		WebElement slider=driver.findElement(By.xpath("//*[@class='flexOne makeFlex']/div[3]//div/div//div/div[5]"));
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.dragAndDropBy(slider,-170,0).build().perform();
		Thread.sleep(7000);
		//JavascriptExecutor js= ((JavascriptExecutor)driver);
		//js.executeScript("window.scroll(0,1000)");
		test_utils.scrollIntoView(slider, driver);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='Container']/div/div[4]/div/div[2]/div/div/div/div/div")).click();
		Thread.sleep(9000);
	
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		int s=tabs.size();
		System.out.println(s);
		driver.switchTo().window(tabs.get(1)); //switches to new tab
		WebElement slider1=driver.findElement(By.xpath("//*[@class='hotel-row-wrapper ']/div/div/div/span"));
		slider1.click();
		test_utils.scrollIntoView(slider1, driver);
		Thread.sleep(5000);
		WebElement slider2=driver.findElement(By.xpath("//*[@class='sidePanelBody']/div[2]/div[2]/div[7]/span"));
		slider2.click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//*[@class='makeFlex column packageUpdate']/div/p")).click();
		Thread.sleep(5000);
		WebElement slider3=driver.findElement(By.xpath("//*[@class='add-activity-container']/div[2]"));
		slider3.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='sidePanelBody']/div[2]/div[2]/div[3]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='makeFlex column packageUpdate']/div/p")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='initerary-nav']/li[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='initerary-nav']/li[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='initerary-nav']/li[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='initerary-nav']/li[5]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}
}





