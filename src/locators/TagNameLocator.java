package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();//Launch an empty browser
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.tagName("input")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
	}

}
