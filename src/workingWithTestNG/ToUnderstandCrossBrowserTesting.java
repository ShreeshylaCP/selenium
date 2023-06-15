package workingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.Super;

public class ToUnderstandCrossBrowserTesting {
	
	@Parameters("browserName")
	@Test
	public void register(@Optional("msedge") String bname) {
		WebDriver driver = null;
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			throw new InvalidBrowserNameException();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Shreeshyla");
		driver.findElement(By.id("LastName")).sendKeys("C P");
		driver.findElement(By.id("Email")).sendKeys("shreeshyla123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Testing@123");
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("Testing@123");
		driver.findElement(By.id("register-button")).click();
		
	}

}

class InvalidBrowserNameException extends RuntimeException {
	public InvalidBrowserNameException() {
	super("enter valid browser name");
	}
}


