package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropMethod {

	public static void main(String[] args) {
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
		
		driver.findElement(By.xpath("//div[text()='Selenium ']")).click();
		
		WebElement popupSrc = driver.findElement(By.xpath("//span[text()='Handling pop-ups']"));
		WebElement framesSrc = driver.findElement(By.xpath("//span[text()='Frames']"));
		WebElement pendingTarget = driver.findElement(By.xpath("//textarea[text()='Topics pending']"));		
		
		WebElement dropdownSrc = driver.findElement(By.xpath("//span[text()='Handling Dropdowns']"));
		WebElement mowdSrc = driver.findElement(By.xpath("//span[text()='Methods Of WebDriver']"));
		WebElement moweSrc = driver.findElement(By.xpath("//span[text()='Methods of WebElement']"));
		WebElement locatorsSrc = driver.findElement(By.xpath("//span[text()='Locators']"));
		WebElement completedTarget = driver.findElement(By.xpath("//textarea[text()='Topics completed']"));
		
		WebElement actionsSrc = driver.findElement(By.xpath("//span[text()='Actions Class']"));
		WebElement ongoingTarget = driver.findElement(By.xpath("//textarea[text()='Ongoing Topics']"));
				
		
		Actions act = new Actions(driver);
		act.dragAndDrop(popupSrc, pendingTarget).perform();
		act.dragAndDrop(framesSrc, pendingTarget).perform();
		
		act.dragAndDrop(dropdownSrc, completedTarget).perform();
		act.dragAndDrop(mowdSrc, completedTarget).perform();
		act.dragAndDrop(moweSrc, completedTarget).perform();
		act.dragAndDrop(locatorsSrc, completedTarget).perform();
		
		act.dragAndDrop(actionsSrc, ongoingTarget).perform();

	}

}
