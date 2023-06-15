package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser 
{
	public static void main(String[] args) 
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver(option); //Launch Chrome Browser
		driver.get("https://www.selenium.dev/");
	}

}
