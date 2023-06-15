package workingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://in.via.com/");
		driver.findElement(By.xpath("//button[text()='No thanks!']")).click();
		driver.findElement(By.xpath("//span[text()='Bus ']")).click();
		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("Pune");
		driver.findElement(By.xpath("//div[text()='Pune']")).click();
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		WebElement departure = driver.findElement(By.id("departure"));
		departure.click();
		driver.findElement(By.xpath("//span[text()='May']/../../..//div[text()='23']")).click();
		driver.findElement(By.xpath("//span[@class='vc-close']")).click();
		driver.findElement(By.xpath("//input[@class='search-btn search-journey']")).click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		source.clear();
		source.sendKeys("Mumbai");
		driver.findElement(By.xpath("//div[text()='Mumbai']")).click();
		dest.clear();
		dest.sendKeys("Goa");
		driver.findElement(By.xpath("//div[text()='Goa']")).click();
//		driver.findElement(By.id("departure")).clear();
		departure.click();
		driver.findElement(By.xpath("//span[text()='May']/../../..//div[text()='25']")).click();
		driver.findElement(By.xpath("//span[@class='vc-close']")).click();
		driver.findElement(By.xpath("//input[@class='search-btn search-journey']")).click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		source.clear();
		source.sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		dest.clear();
		dest.sendKeys("Delhi");
		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
//		driver.findElement(By.id("departure")).clear();
		departure.click();
		driver.findElement(By.xpath("//span[text()='May']/../../..//div[text()='27']")).click();
		driver.findElement(By.xpath("//span[@class='vc-close']")).click();
		driver.findElement(By.xpath("//input[@class='search-btn search-journey']")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
