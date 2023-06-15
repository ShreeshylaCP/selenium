package qsp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUnderstandSwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();//Launch an empty browser
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("java", Keys.ENTER);

	}

}
