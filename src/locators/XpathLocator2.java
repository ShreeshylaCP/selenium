package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathLocator2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(option);
		Thread.sleep(10000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()='Phone number, username or email address']")).sendKeys("admin");
		*/
		
		
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		Thread.sleep(7000);
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("asdff");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
	}

}
