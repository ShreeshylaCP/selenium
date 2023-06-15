package assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandHardAssert {
	
	@Test
	public void assertionPractice() {
		String expectedLoginPageTitle = "actiTIME - Login";
		String usernameData = "admin";
		String passwordData = "manager";
//		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://demo.actitime.com/login.do");
		String actualLoginPageTitle = driver.getTitle();
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, "Login Page Is Not Displayed");
		
		WebElement usn = driver.findElement(By.id("username"));
		usn.clear();
		usn.sendKeys(usernameData);
		Assert.assertEquals(usn.getAttribute("value"), usernameData, "Username Is Not Displayed");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.clear();
		pwd.sendKeys(passwordData);
		Assert.assertEquals(pwd.getAttribute("value"), passwordData, "Password Is Not Displayed");
		
		driver.findElement(By.id("loginButton")).click();
		
	}

}
