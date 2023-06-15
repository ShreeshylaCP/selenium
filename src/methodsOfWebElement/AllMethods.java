package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demo.actitime.com/login.do");
	    WebElement usn = driver.findElement(By.id("username"));
	    WebElement pwd = driver.findElement(By.name("pwd"));
	    WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
	    WebElement loginButton = driver.findElement(By.id("loginButton"));
	    WebElement linkText = driver.findElement(By.linkText("Forgot your password?"));
	    
	    //sendKeys()
	    usn.sendKeys("admin");
	    Thread.sleep(1000);
	    
	    //clear()
	    usn.clear();
	    Thread.sleep(1000);
	    
	    //getSize()
	    Dimension size = pwd.getSize();
	    int height = size.getHeight();
	    int width = size.getWidth();
	    System.out.println("Height is: " + height + "; Width is: " + width );
	    Thread.sleep(1000);
	    
	    //getAttribute()
	    String attributeValue = pwd.getAttribute("class");
	    System.out.println(attributeValue);
	    Thread.sleep(1000);
	    
	    //getCssValue()
	    String valueOfCssAttribute = loginButton.getCssValue("background");
	    System.out.println(valueOfCssAttribute);
	    Thread.sleep(1000);
	    
	    //getLocation()
	    Point loc = loginButton.getLocation();
	    int Xaxis = loc.getX();
	    int Yaxis = loc.getY();
	    System.out.println("X-axis is : "+ Xaxis + "; Y-axis is : "+ Yaxis);
	    Thread.sleep(1000);
	    
	    //getText()
	    String loginText = loginButton.getText();
	    System.out.println(loginText);
	    Thread.sleep(1000);	    
	    
	    //getRect()
	    Rectangle rect = loginButton.getRect();
	    System.out.println(rect.getHeight());
	    System.out.println(rect.getWidth());
	    Thread.sleep(1000);	    
	    
	    //isEnabled()
	    boolean result = loginButton.isEnabled();
	    System.out.println(result);
	    Thread.sleep(1000);	 
	    
	    //isSelected()
	    checkBox.click();
	    boolean output = checkBox.isSelected();
	    System.out.println(output);
	    Thread.sleep(1000);
	    
	    //isDisplayed()
	    boolean text = linkText.isDisplayed();
	    System.out.println(text);
	    Thread.sleep(1000);
	    
	    //getTagName()
	    String tagName = linkText.getTagName();
	    System.out.println(tagName);
	    Thread.sleep(1000);
	    
	    
	    //submit()
	    //loginButton.submit();
	    
	    //click()
	    loginButton.click();

	}

}
