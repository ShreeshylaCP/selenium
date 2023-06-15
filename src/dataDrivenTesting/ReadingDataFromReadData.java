package dataDrivenTesting;

import genericLibrary.ReadData;

public class ReadingDataFromReadData {

	public static void main(String[] args) {
		System.out.println(ReadData.fromExcel("Number", 8, 2));
		System.out.println(ReadData.fromExcel("Boolean", 20, 7));
		System.out.println(ReadData.fromExcel("Date", 14, 3));
		System.out.println(ReadData.fromExcel("String", 12, 4));
		
		System.out.println(ReadData.fromPropertyFile("url"));
		
		System.out.println(ReadData.fromPropertyFile1("chromeDriverPath"));

	}

}
