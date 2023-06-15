package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("file:///E:/SOFTWARE%20TESTING/Selenium/HTML/multiSelectDropDown.html");
	    
	    WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
	    Select sel = new Select(multiSelectDD);
	    
	    sel.selectByIndex(2);
	    Thread.sleep(1000);
	    
	    sel.selectByValue("v5");
	    Thread.sleep(1000);
	    
	    sel.selectByVisibleText("Poha");
	    Thread.sleep(1000);
	    
	    System.out.println(sel.isMultiple());
	    System.out.println();
	    
	    List<WebElement> msopt = sel.getOptions();
	    for (WebElement we : msopt) 
	    {
			String msoptText = we.getText();
			System.out.println(msoptText);
			Thread.sleep(500);
		}
	    
	    System.out.println();
	    
	    System.out.println(sel.getFirstSelectedOption().getText());
	    Thread.sleep(1000);
	    
	    System.out.println();
	    List<WebElement> allSelected = sel.getAllSelectedOptions();
	    for (WebElement as : allSelected) 
	    {
	    	String asOpt = as.getText();
	    	System.out.println(asOpt);
			Thread.sleep(500);
		}
	    
	    System.out.println();
	    
	    WebElement wrapped = sel.getWrappedElement();
	    String wrappedOpts = wrapped.getText();
	    System.out.println(wrappedOpts);
	    
	    
	    sel.deselectByIndex(2);	      
	    sel.deselectByValue("v1");	    
	    sel.deselectByVisibleText("Pulav");
	    
	    sel.selectByIndex(4);
	    Thread.sleep(500);
	    sel.selectByValue("v2");
	    Thread.sleep(500);
	    sel.selectByVisibleText("Idli");
	    Thread.sleep(500);
	    
	    sel.deselectAll();
	   

	}

}
