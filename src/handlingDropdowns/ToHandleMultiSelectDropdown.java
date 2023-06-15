package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://omayo.blogspot.com/");
		WebElement multiSelectDD = driver.findElement(By.id("multiselect1"));
		
		Select multiSelect = new Select(multiSelectDD);
		multiSelect.selectByIndex(1);
		Thread.sleep(1000);
		multiSelect.selectByValue("volvox");
		Thread.sleep(1000);
		multiSelect.selectByVisibleText("Audi");
		Thread.sleep(1000);
		
		System.out.println("Is the Dropdown Multi-select ? "+ multiSelect.isMultiple());
		System.out.println();
		List<WebElement> options = multiSelect.getOptions();
		for (WebElement we : options) 
		{
			System.out.println(we.getText());
		}
		System.out.println();
		System.out.println(multiSelect.getFirstSelectedOption().getText());
		System.out.println();
		
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		for (WebElement ele : selectedOptions) 
		{
			System.out.println(ele.getText());
		}
		System.out.println();
		
		WebElement wrapped = multiSelect.getWrappedElement();
		String ops = wrapped.getText();
		System.out.println(ops);
		
		System.out.println();
		
		multiSelect.deselectByIndex(1);
		Thread.sleep(1000);
		multiSelect.deselectByValue("audix");
		Thread.sleep(1000);
		multiSelect.deselectByVisibleText("Volvo");
		Thread.sleep(1000);
		multiSelect.deselectAll();

	}

}
