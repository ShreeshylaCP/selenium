package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToAvoidFileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); 
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.id("uploadfile")).sendKeys("D:\\resume\\Resume_Shreeshyla CP_MCE_Hassan.docx");

	}

}
