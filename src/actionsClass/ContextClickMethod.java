package actionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://trello.com/en/login");
		driver.findElement(By.id("user")).sendKeys("shreeshylacp@gmail.com");
		driver.findElement(By.id("login")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shree@452");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//div[text()='Selenium ']")).click();
		
		WebElement contextElement = driver.findElement(By.xpath("//span[text()='Methods Of WebDriver']"));
		
		Actions act = new Actions(driver);
		act.contextClick(contextElement).perform();
		
		 List<WebElement> methodsOfWebDriverCard = driver.findElements(By.xpath("//span[@class='quick-card-editor-buttons-item-text']"));
		 for (WebElement ele : methodsOfWebDriverCard) 
		 {
			String options = ele.getText();
			System.out.println(options);
			Thread.sleep(1000);
		 }
		

	}

}
