package TestNGDemo;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_file extends test_utils {
	
	WebDriver driver;
	
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		@BeforeTest
		public void test1() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		@Test
		public void test2() throws InterruptedException {
			Thread.sleep(5000);
			WebElement web=driver.findElement(By.xpath("//button[@type='submit']"));
			//demoutil.falshelement(web, driver);
			test_utils.changeColor("#FF0000", web, driver);
			//demoutil.drawBorder(web, driver);
		}
		
		
		


}
