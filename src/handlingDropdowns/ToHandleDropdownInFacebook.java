package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropdownInFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayDropDown);
		System.out.println("Is Day Dropdown Multi-select : " + daySelect.isMultiple());
		List<WebElement> dayDropdownOptions = daySelect.getOptions();
		for (WebElement ele : dayDropdownOptions) 
		{
			System.out.println(ele.getText());
		}
		System.out.println();
		daySelect.selectByIndex(16);
		System.out.println("--------------------------------------------------------------");
		
		Select monthSelect = new Select(monthDropDown);
		WebElement monthDropdownOptions = monthSelect.getWrappedElement();
		String monthOptions = monthDropdownOptions.getText();
		System.out.println(monthOptions);
		System.out.println();
		monthSelect.selectByValue("9");
		System.out.println("---------------------------------------------------------------");
		
		Select yearSelect = new Select(yearDropDown);
		yearSelect.selectByVisibleText("1947");
				
	}

}
