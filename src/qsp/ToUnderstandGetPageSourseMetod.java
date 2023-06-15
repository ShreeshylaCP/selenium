package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUnderstandGetPageSourseMetod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();//Launch an empty browser
		Thread.sleep(4000);
		driver.get("http://www.omayo.blogspot.com/");//Launch the web Application
		Thread.sleep(2000);
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);

	}

}
