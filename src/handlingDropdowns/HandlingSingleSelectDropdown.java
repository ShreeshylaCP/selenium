package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("file:///E:/SOFTWARE%20TESTING/Selenium/HTML/menuDropDown.html");
	    WebElement singleSelectDD = driver.findElement(By.id("menu"));
	    
	    Select sel= new Select(singleSelectDD);
	    sel.selectByIndex(3);
	    Thread.sleep(1000);
	    
	    sel.selectByValue("v7");
	    Thread.sleep(1000);
	    
	    sel.selectByVisibleText("Vadapav");
	    Thread.sleep(1000);
	    
	    System.out.println(sel.isMultiple()); 
	    Thread.sleep(1000);
	    
	    System.out.println();
	    
	    List<WebElement> opt = sel.getOptions();
	    for (WebElement we : opt) 
	    {
	    	String DDOpt = we.getText();
			System.out.println(DDOpt);
		}
	    Thread.sleep(1000);
	    
	    System.out.println();
	    
	    System.out.println(sel.getFirstSelectedOption().getText());
	    Thread.sleep(1000);
	    
	    System.out.println();
	    
	    WebElement wrapped = sel.getWrappedElement();
	    String options = wrapped.getText();
	    System.out.println(options);
	    
	}

}
