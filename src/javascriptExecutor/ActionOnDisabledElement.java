package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionOnDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Implicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Explicit wait
		
		driver.get("http://omayo.blogspot.com/");
		WebElement disabledButton = driver.findElement(By.id("but1"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// Passing keys to Disabled Element
		js.executeScript("document.getElementById('tb2').value='It is working!!!'");
		Thread.sleep(2000);
		
		// Click on Disabled Button
		js.executeScript("arguments[0].click()", disabledButton);

	}

}
