package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataNew {
	
	public static String fromExcel (String sheetName, int rowNO, int cellNO) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(new File("./testData/testData.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		
		if(sheetName.equalsIgnoreCase("Number")) {
			double value = workbook.getSheet(sheetName).getRow(rowNO).getCell(cellNO).getNumericCellValue();
			String s = String.valueOf(value);
			return s;
		}
		else if(sheetName.equalsIgnoreCase("Boolean")) {
			boolean bool = workbook.getSheet(sheetName).getRow(rowNO).getCell(cellNO).getBooleanCellValue();
			String b = String.valueOf(bool);
			return b;
		}
		else if(sheetName.equalsIgnoreCase("Date")) {
			String dateAndTime = workbook.getSheet(sheetName).getRow(rowNO).getCell(cellNO).getLocalDateTimeCellValue().toString();
			return dateAndTime;
		}
		else  {
			return workbook.getSheet(sheetName).getRow(rowNO).getCell(cellNO).getStringCellValue();
		}
		
			
		}
	public static String fromPropertyFile (String key) throws IOException {
		FileInputStream fis = new FileInputStream(new File("./testData/configuration.properties"));
		Properties properties = new Properties();
		properties.load(fis);
		
		return properties.getProperty(key).toString();
				
	}
	
	public static String fromPropertyFile1 (String key) throws IOException {
		FileInputStream fis = new FileInputStream(new File("./testData/sampleScriptData.properties"));
		Properties properties = new Properties();
		properties.load(fis);
		
		
		return properties.getProperty(key).toString();
		
	}

}
