package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.implementation.bytecode.Division;

public class XpathforDependentAndIndependent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		Thread.sleep(4000);
		
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(7000);
		//driver.findElement(By.id("ddate")).click();
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		Thread.sleep(7000);
		//driver.findElement(By.xpath("//div[text()='Apr 2023']/../..//li[text()='19']")).click();
		driver.findElement(By.xpath("//div[text()='Apr 2023']/../..//li[text()='21']")).click();

	}

}
