package popups;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleHiddenDivisionPopup {

	public static void main(String[] args) {
		LocalDateTime systemSDateTime = LocalDateTime.now().plusMonths(7);
		System.out.println(systemSDateTime);
		String monthName = systemSDateTime.getMonth().name();
		System.out.println(monthName);
		int year = systemSDateTime.getYear();
		System.out.println(year);
		int day = systemSDateTime.getDayOfMonth();
		System.out.println(day);
		
		String month = ""+monthName.charAt(0)+monthName.substring(1, monthName.length()).toLowerCase();
		System.out.println(month);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		for(;;) 
		{
			try 
			{
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+day+"']")).click();
				break;
			} 
			catch (NoSuchElementException e) 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

	}

}
