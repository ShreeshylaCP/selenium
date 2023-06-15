package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUnderstandGetWindowHandleMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();//Launch an empty browser
		Thread.sleep(4000);
		driver.get("http://www.omayo.blogspot.com/");//Launch the web Application
		Thread.sleep(2000);
		
		//to get address of parent window
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		
		//to get a new window (child window)
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);
		
		//to get address of both windows
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		
	}

}
