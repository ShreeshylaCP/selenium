package qsp;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUnderstandMaximizeSetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();//Launch an empty browser
		Thread.sleep(1000);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Point targetPosition = new Point(30,250);
		driver.manage().window().setPosition(targetPosition);

	}

}
