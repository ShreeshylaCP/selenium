package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();//Launch an empty browser
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys("admin");
	}

}
