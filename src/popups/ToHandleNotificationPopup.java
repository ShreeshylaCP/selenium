package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleNotificationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Implicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Explicit wait
		
		driver.get("https://www.easemytrip.com/");
		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
		
		Runtime.getRuntime().exec("./autoITPrograms/HandleNotification.exe");

		
	}

}
