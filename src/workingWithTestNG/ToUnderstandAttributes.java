package workingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToUnderstandAttributes {
	
	@Test(invocationCount = 2)
	public void irctc() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.irctc.com/");
		Thread.sleep(2000);
		driver.close();		
	}
	
	@Test(invocationCount = 3, threadPoolSize = 2)
	public void clearTrip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.close();		
	}
	
	@Test(enabled = false)
	public void makeMyTrip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.close();		
	}
	
	@Test(invocationCount = -1)
	public void goibibo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		driver.close();		
	}
	
	@Test(invocationCount = 2, threadPoolSize = 4)
	public void redbus() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.close();		
	}
	
	@Test(timeOut = 3000)
	public void shoppersStack() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		driver.close();		
	}


}
