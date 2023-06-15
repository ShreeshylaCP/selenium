package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Implicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Explicit wait
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.id("confirm")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(confirmationAlert.getText());
		Thread.sleep(1000);
		confirmationAlert.accept();

	}

}
