package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.manage().window().maximize();		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded'][1]"));
		driver.switchTo().frame(frameElement);
		WebElement photoSrc = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement trashTarget = driver.findElement(By.id("trash"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(photoSrc, trashTarget).perform();
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//li[text()='Accepted Elements']")).click();
		
		
		//2nd Frame
		WebElement frameElement2 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded'][2]"));
		driver.switchTo().frame(frameElement2);
		
		WebElement textSrc = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppableTarget = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(textSrc, droppableTarget).perform();

	}

}
