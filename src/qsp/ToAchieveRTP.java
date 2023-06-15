package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToAchieveRTP 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Which browser do you want to launch?");
		String browserValue=sc.next();
		
		if (browserValue.equalsIgnoreCase("Chrome")) 
		{
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver(opt);
			driver.get("https://www.facebook.com/");
			Thread.sleep(4000);
			driver.close();
		}
		else if (browserValue.equalsIgnoreCase("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.instagram.com/");
			Thread.sleep(80000);
			driver.close();
		}
		else 
		{
			System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(6000);
			driver.close();
		}
	}
}
