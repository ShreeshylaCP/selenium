package configurationAnnotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import genericLibrary.ReadData;

public class ToUnderstandConfigurationAnnotation {
	WebDriver driver = null;
	
	String expectedLoginPageTitle = "actiTIME - Login";
	String expectedTaskTabTitle = "actiTIME - Task List";
	String url = ReadData.fromPropertyFile("url");
	String usernameData = "admin";
	String passwordData = "manager";
	String expectedHomePageTitle = "actiTIME - Enter Time-Track";
	String customerData = "icici";	
	@Parameters("browserName")
	@BeforeClass
	public void browserSetUP(@Optional("firefox") String bname) {
		if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			throw new InvalidBrowserValueException();
		}
		Reporter.log("Empty browser Is Launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser Is Maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
		String actualLoginPageTitle = driver.getTitle();
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			Reporter.log("Login Page Is Displayed", true);
		}
		else {
			Reporter.log("Login Page Is Not Displayed", true);
		}
		
	}
	
	@BeforeMethod
	public void loginToApplication () {
		WebElement usn = driver.findElement(By.id("username"));
		usn.clear();
		usn.sendKeys(ReadData.fromPropertyFile("username"));
		String actualUsernameData = usn.getAttribute("value");
		if (usernameData.equals(actualUsernameData)) {
			Reporter.log("Successfully entered Username in username textfield", true);
		}
		else {
			Reporter.log("Username is not entered correctly", true);
		}
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.clear();
		pwd.sendKeys(ReadData.fromPropertyFile("password"));
		String actualPasswordData = pwd.getAttribute("value");
		if (passwordData.equals(actualPasswordData)) {
			Reporter.log("Successfully entered Password in password textfield", true);
		}
		else {
			Reporter.log("Password is not entered correctly", true);
		}
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		String actualHomePageTitle = driver.getTitle();
		if (actualHomePageTitle.equals(expectedHomePageTitle)) {
			Reporter.log("Home Page is displayed");
			Reporter.log("successfully Logged In to the Application");
		}
		else {
			Reporter.log("Home Page is  Not displayed");
		}
	}
	
	@Test
	public void createCustomer() {
		driver.findElement(By.id("container_tasks")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Add New']")));
		String actualTaskTabTitle = driver.getTitle();
		if (expectedTaskTabTitle.equals(actualTaskTabTitle)) {
			Reporter.log("Task Page Is Displayed", true);
		}
		else {
			Reporter.log("Task Page Is Not Displayed", true);
		}
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		WebElement customer = driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]"));
		customer.sendKeys(ReadData.fromPropertyFile("customer"));
		String customerName = customer.getAttribute("value");
		if (customerName.equals(customerData)) {
			Reporter.log("Successfully entered valid customer name", true);
		}
		else {
			Reporter.log("Customer Name Is Invalid", true);
		}
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		WebElement searchBox = driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]"));
		searchBox.clear();
		searchBox.sendKeys("icici");
		WebElement createdCustomer = driver.findElement(By.xpath("//span[text()='icici']"));
		String customerNameText = createdCustomer.getText();
		if (customerNameText.equals(customerName)) {
			Reporter.log("Customer Created Successfully", true);
		}
		else {
			Reporter.log("Customer Not Created", true);
		}
	}
	
	@AfterMethod
	public void logoutOfApplication() {
		driver.findElement(By.linkText("Logout")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		String actualLoginPage = driver.getTitle();
		if (expectedLoginPageTitle.equals(actualLoginPage)) {
			Reporter.log("Login Page Displayed", true);
			Reporter.log("Successfully Logged Out", true);
		}
		else {
			Reporter.log("Login Page Is not Displayed", true);
		}
	}
	
	@AfterClass
	public void browserTearDown() {
		driver.quit();
		Reporter.log("successfully closed the browser", true);
	}

}

class InvalidBrowserValueException extends RuntimeException {
	public InvalidBrowserValueException() {
		super("The browser name passed is invalid");
	}
}
