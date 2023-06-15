package workingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToUnderstandDataProviderUsingScript1 {
	
	@DataProvider()
	public String [] getUrl() {
		String [] sarr = { "https://www.royalenfield.com/",
							"https://www.harley-davidson.com/",
							"https://www.astonmartin.com/",
							"https://www.bugatti.com/"
					     };
		
		return sarr;		
	}
	
	@Test (dataProvider = "getUrl")
	public void launchApplication(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}

}
