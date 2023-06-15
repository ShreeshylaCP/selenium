package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Cars_022 {
	
	@Test (groups = "compatibility")
	public void cars () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw.in/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
