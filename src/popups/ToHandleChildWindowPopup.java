package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.manage().window().maximize();		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://licindia.in/");
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.linkText("Agents Portal")).click();
		
		Alert confirmationAlert = driver.switchTo().alert();
		confirmationAlert.accept();
		
		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowIDs = driver.getWindowHandles();
		
		for (String s : allWindowIDs)
		{
			driver.switchTo().window(s);
		}
		Thread.sleep(4000);
		driver.close();

	}

}
