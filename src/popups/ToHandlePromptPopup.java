package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandlePromptPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Implicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Explicit wait
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		WebElement iframeResult = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(iframeResult);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(1000);
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(promptAlert.getText());
		Thread.sleep(1000);
		promptAlert.sendKeys("Shree");
		Thread.sleep(5000);
		promptAlert.accept();
		

	}

}
