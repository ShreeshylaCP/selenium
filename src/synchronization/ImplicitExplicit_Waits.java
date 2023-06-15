package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit_Waits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(65));// Implicit Wait
		
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));// Explicit Wait
		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		
		WebElement facebookLink = driver.findElement(By.linkText("Facebook"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(facebookLink));
		facebookLink.click();
		

	}

}
