package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUnderstandMaximizeSetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();//Launch an empty browser
		Thread.sleep(1000);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Dimension targetSize=new Dimension(750, 450);
		driver.manage().window().setSize(targetSize);

	}

}
