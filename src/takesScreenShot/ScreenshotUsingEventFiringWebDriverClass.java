package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreenshotUsingEventFiringWebDriverClass {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		File src = efw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/flipcart.png");
		
		Files.copy(src, dest);

	}

}
