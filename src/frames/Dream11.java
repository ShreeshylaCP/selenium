package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dream11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.manage().window().maximize();		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("regEmail")).sendKeys("9448973379");

	}

}
