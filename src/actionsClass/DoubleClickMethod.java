package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://omayo.blogspot.com/");
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		WebElement doubleClickElement = driver.findElement(By.xpath("//p[text()='Double-click']"));
		
		Actions act = new Actions(driver);
		//act.doubleClick(doubleClick).perform();
		
		act.doubleClick(doubleClickElement).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Flipkart")).click();
		

	}

}
