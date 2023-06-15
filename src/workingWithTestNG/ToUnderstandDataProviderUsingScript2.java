package workingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToUnderstandDataProviderUsingScript2 {
	
	@DataProvider
	public String [][] getCredentials() {
		
		String cred [][] = {
							{"admin", "manager"},
							{"trainee", "trainee"}			
						   };
		return cred;		
	}
	
	@Test (dataProvider = "getCredentials")
	public void launchApplication(String [] credentials) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(credentials [0]);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(credentials [1]);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(15000);
		driver.quit();

		
	}

}
