package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicit_Waits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(65));// Implicit Wait
		
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));// Explicit Wait
		
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.id("electronics")).click();
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 13 Pro max']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		WebElement checkButton = driver.findElement(By.id("Check"));
		
		
		
		explicitWait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
		

	}

}
