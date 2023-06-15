package workingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchBusesForThreeDifferentFromAndToLocations {
	
	@Test
	public void searchBusesForThreeDifferentFromAndToLocations() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://in.via.com/");
		driver.findElement(By.xpath("//button[text()='No thanks!']")).click();
		BasePage basePage = new BasePage(driver);
		basePage.getBusNavBarIcon().click();
		
		BusHomePage busHomePage = new BusHomePage(driver);
		busHomePage.getFromTextField().clear();
		busHomePage.getFromTextField().sendKeys("Pune");
		busHomePage.getPuneSearchSuggestion().click();
		busHomePage.getTotextField().clear();
		busHomePage.getTotextField().sendKeys("Bangalore");
		busHomePage.getBangaloreSearchSuggestion().click();
		busHomePage.getDepartureField().click();
		busHomePage.getPuneBangaloreDepartureDate().click();
		busHomePage.getCalenderClose().click();
		busHomePage.getSearchBusesButton().click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		busHomePage.getFromTextField().clear();
		busHomePage.getFromTextField().sendKeys("Mumbai");
		busHomePage.getMumbaiSearchSuggestion().click();
		busHomePage.getTotextField().clear();
		busHomePage.getTotextField().sendKeys("Goa");
		busHomePage.getGoaSearchSuggestion().click();
		busHomePage.getDepartureField().click();
		busHomePage.getMumbaiGoaDepartureDate().click();
		busHomePage.getCalenderClose().click();
		busHomePage.getSearchBusesButton().click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		busHomePage.getFromTextField().clear();
		busHomePage.getFromTextField().sendKeys("Bangalore");
		busHomePage.getBangaloreSearchSuggestion().click();
		busHomePage.getTotextField().clear();
		busHomePage.getTotextField().sendKeys("Delhi");
		busHomePage.getDelhiSearchSuggestion().click();
		busHomePage.getDepartureField().click();
		busHomePage.getBangaloreDelhiDepartureDate().click();
		busHomePage.getCalenderClose().click();
		busHomePage.getSearchBusesButton().click();
		
		Thread.sleep(5000);
		driver.quit();
				
	}

}
