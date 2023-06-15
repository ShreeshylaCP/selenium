package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Bikes_013 {
	
	@Parameters("browserName")
	@Test
	public void bikes(String bname) throws InterruptedException {
		System.out.println(bname);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.honda2wheelersindia.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
