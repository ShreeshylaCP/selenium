package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleMaps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.manage().window().maximize();		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='app']"));//To find Frame		
		driver.switchTo().frame(frameElement);			
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(7000);
		driver.navigate().back();//To Come out of maps
		driver.switchTo().defaultContent();//To switch back the control from frame to main web page
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium.dev",Keys.ENTER);
//		driver.switchTo().activeElement().sendKeys("Selenium.dev",Keys.ENTER);

	}

}
