package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathUsingIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		Thread.sleep(4000);
		
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(7000);
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//li[text()='27'])[2]")).click();

	}

}
