package TestNGDemo;

//import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_utils {

	public static void falshelement(WebElement element,WebDriver driver) {
		 String bgcolor=element.getCssValue("backgroundColor");
		 for (int i=0;i<10;i++) {
			 changeColor("#FFFFFF",element,driver);
			 changeColor(bgcolor,element,driver);
		 }
	 }	
	
		 public static void changeColor(String color,WebElement element,WebDriver driver) {
			 JavascriptExecutor js=((JavascriptExecutor)driver);
			 js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
			 try {
					Thread.sleep(3000);
				}catch(InterruptedException e) {
					
				}
		 }

		 public static void drawBorder(WebElement element,WebDriver driver) {
				JavascriptExecutor js= ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].style.border = '3px solid blue '", element);
			}

		 public static String getTitleByJS(WebDriver driver) {
				JavascriptExecutor js= ((JavascriptExecutor)driver);
				String title= js.executeScript("return document.title;").toString();
				return title;
			
		}
		 public static void scrollIntoView(WebElement element, WebDriver driver) {
				JavascriptExecutor js= ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].scrollIntoView(true);", element);
		 }
		 public static void clickElementByJS(WebElement element, WebDriver driver) {
				JavascriptExecutor js= ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].click();",element);
		 }
		 public static void passingValuesUsingJS(WebElement element, String message, WebDriver driver) {
				JavascriptExecutor js= ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].value='" + message + "'", element);
		 }
}
