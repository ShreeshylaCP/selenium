package workingWithTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToUnderstandDataProviderUsingExcel2 {
	
	@DataProvider
	public String [][] loginCredentials() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(new File("./testData/testData.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet loginSheet = workbook.getSheet("login");
		int rowCount = loginSheet.getPhysicalNumberOfRows()-1;
		int colCount = loginSheet.getRow(1).getPhysicalNumberOfCells();
		
		String [][] login = new String [rowCount] [colCount];
		
		for (int i = 1, k = 0; i <= rowCount; i++, k++) {
			for (int j = 0; j < colCount; j++) {
				login [k][j] = loginSheet.getRow(i).getCell(j).toString();
			}
		}			
		return login;		
	}
	
	@Test (dataProvider = "loginCredentials")
	public void actiTimeLogin(String [] login) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(login [0]);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(login [1]);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(15000);
		driver.quit();
		
	}

}
