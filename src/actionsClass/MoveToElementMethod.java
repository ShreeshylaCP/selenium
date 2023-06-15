package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		WebElement homeAppliances = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(homeAppliances).perform();
		driver.findElement(By.linkText("Refrigerators")).click();
		

	}

}
