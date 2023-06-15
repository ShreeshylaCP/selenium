package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		//Step 1: Create object of InputStream
//		File absPath = new File("./testData/testData.xlsx");
//		FileInputStream fis = new FileInputStream(absPath);
		
		FileInputStream fis = new FileInputStream(new File("./testData/testData.xlsx"));
		
		//Step 2: Create object of File type
		
//		Workbook workbook = new XSSFWorkbook(fis); //1st way
		
		Workbook workbook = WorkbookFactory.create(fis); //2nd way
		
		//Step 3: Read methods
		
		double num = workbook.getSheet("number").getRow(8).getCell(2).getNumericCellValue();
		String str = workbook.getSheet("string").getRow(12).getCell(4).getStringCellValue();
		boolean bool = workbook.getSheet("boolean").getRow(20).getCell(7).getBooleanCellValue();
		Date date = workbook.getSheet("date").getRow(14).getCell(3).getDateCellValue();
		
		System.out.println(num);
		System.out.println(str);
		System.out.println(bool);
		System.out.println(date);

	}

}
