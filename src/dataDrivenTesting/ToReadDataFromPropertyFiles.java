package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFiles {

	public static void main(String[] args) throws IOException {
		
		//Step 1: Creating InputStream Type Object
		File absPath = new File("./testData/configuration.properties");
		FileInputStream fis = new FileInputStream(absPath);
		
//		FileInputStream fis = new FileInputStream(new File("./testData/configuration.properties"));
		
		//Step 2: Creating Object of File Type
		Properties properties = new Properties();
		properties.load(fis);
		
		//Call Appropriate Read Methods
		String name = properties.get("name").toString();
		System.out.println(name);
		
		System.out.println(properties.get("url").toString());

	}

}
