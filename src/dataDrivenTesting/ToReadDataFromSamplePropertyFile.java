package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromSamplePropertyFile {


	public static void main(String[] args) throws IOException {

		//Step 1: Create Object of InputStream Type 
		FileInputStream fis = new FileInputStream(new File("./testData/sampleScriptData.properties"));
		
		//Step 2: Create Object of File Type
		Properties properties = new Properties();
		properties.load(fis);
		
		//Step 3: Read Methods
		String key = properties.get("chromeBrowserKey").toString();
		
		String value = properties.get("chromeDriverPath").toString();
		
		String url = properties.get("url").toString();
		
		System.setProperty(key, value);
	    WebDriver driver=new ChromeDriver();
	    driver.get(url);

	}

}
