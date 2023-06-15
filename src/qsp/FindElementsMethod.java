package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions option= new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
	
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys("bikes");
		List<WebElement> bikes = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		//for (WebElement we : bikes) 
		//{
		//	String option = we.getText();
		//	System.out.println(option);
		//	Thread.sleep(1000);
		//}
		
		//System.out.println(bikes.size());
		for (int i = 0; i < bikes.size(); i++) 
		{
			String options = bikes.get(i).getText();
			System.out.println(options);
			Thread.sleep(1000);
		}

	}

}
