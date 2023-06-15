package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		Thread.sleep(1000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("adin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[.=' Login ']")).click();
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		/*
		driver.get("https://www.instagram.com/");
		Thread.sleep(7000);
		
		//Xpath by using Unique attribute
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		//Xpath by using text()
		driver.findElement(By.xpath("//span[text()='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		
		//Xpath by using . function
		driver.findElement(By.xpath("//span[text()='Password']")).sendKeys("abc");
		driver.findElement(By.xpath("//span[.='Phone number, username, or email']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//span[text()='Phone number, username, or email']")).sendKeys("admin");
		*/
	}

}
