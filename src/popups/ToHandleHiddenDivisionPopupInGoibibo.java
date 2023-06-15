package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleHiddenDivisionPopupInGoibibo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[text()='April 2023']/../..//p[text()='28']")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();

	}

}
