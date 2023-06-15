package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUnderstandQuitMethod {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver= new EdgeDriver();//Launch an empty browser
			Thread.sleep(4000);
			driver.get("http://www.omayo.blogspot.com/");//Launch the web application
			driver.findElement(By.linkText("Open a popup window")).click();
			Thread.sleep(2000);
			driver.quit();

	}

}
