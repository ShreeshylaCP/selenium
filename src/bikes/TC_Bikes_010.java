package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Bikes_010 {
	
	@Test (groups = "functionality")
	public void bikes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
