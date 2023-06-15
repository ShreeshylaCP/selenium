package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSselectorLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();//Launch an empty browser
		Thread.sleep(1000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name$='e']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name^='p']")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class*='p']")).click();
		

	}

}
