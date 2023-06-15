package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandScrollingActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Implicit Wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Explicit wait
		
		driver.get("http://omayo.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//To scroll window 500 pixels downwards
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		//Tp scroll window 250 pixels upwards
		js.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(2000);
		
		//Tp scroll window 300 pixels towards right
		js.executeScript("window.scrollBy(300,0)");
		Thread.sleep(2000);
		
		//Tp scroll window 250 pixels towards left
		js.executeScript("window.scrollBy(-250,0)");
		Thread.sleep(2000);
		
		// To scroll to the end of the page
		// document.body.scrollHeight
		js.executeScript("window.scrollBy(0,2499)");
		
		// To scroll to the extreme right of the page
		// document.body.scrollWidth
		js.executeScript("window.scrollBy(1360,0)" );

	}

}
