package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Bikes_012 {
	
	@Test (groups = "smoke")
	public void bikes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ducati.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
