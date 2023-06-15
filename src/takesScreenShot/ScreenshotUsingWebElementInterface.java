package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreenshotUsingWebElementInterface {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement imgAddress = driver.findElement(By.id("username"));
		File src = imgAddress.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/username.png");
		
		Files.copy(src, dest);

	}

}
