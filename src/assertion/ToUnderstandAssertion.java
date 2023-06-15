package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandAssertion {
	
	@Test
	public void assertionPractice() {
		String expectedLoginPageTitle = "actiTIME - Login";
		String usernameData = "admin";
		String passwordData = "manager";
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		SoftAssert sa = new SoftAssert();
		driver.get("https://demo.actitime.com/login.do");
		String actualLoginPageTitle = driver.getTitle();
		sa.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, "Login Page Is Not Displayed");
		
		WebElement usn = driver.findElement(By.id("username"));
		usn.clear();
		usn.sendKeys(usernameData);
		sa.assertEquals(usn.getAttribute("value"), usernameData, "Username Is Not Displayed");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.clear();
		pwd.sendKeys(passwordData);
		sa.assertEquals(pwd.getAttribute("value"), passwordData, "Password is not displayed");
		
		driver.findElement(By.id("loginButton")).click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		String actualHomePageTitle = driver.getTitle();
		sa.assertEquals(actualHomePageTitle, expectedHomePageTitle, "Home page is not displayed");
		sa.assertAll();
		
	}

}
