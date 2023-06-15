package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathLocatorUsingContains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		Thread.sleep(7000);
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(7000);
		
		//driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and contains(@name,'username')]")).sendKeys("admin");
		
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(.,' Login ')]")).click();
		

	}

}
