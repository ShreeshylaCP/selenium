package workingWithTestNG;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_SampleScripts_001 {
	
	@Test(priority = 5)
	public void irctc() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.irctc.com/");
		Thread.sleep(2000);
		driver.close();		
	}
	
	@Test(priority = 1)
	public void clearTrip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.close();		
	}
	
	@Test(priority = -8)
	public void makeMyTrip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.close();		
	}
	
	@Test(priority = -5)
	public void goibibo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		driver.close();		
	}
	
	@Test(priority = 5)
	public void redbus() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.close();		
	}
	

}
