package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//span[text()='Select WORD files']")).click();
		
		Runtime.getRuntime().exec("./autoITPrograms/FileUpload.exe");

	}

}
