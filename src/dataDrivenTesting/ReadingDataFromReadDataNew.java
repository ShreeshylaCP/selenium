package dataDrivenTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericLibrary.ReadDataNew;

public class ReadingDataFromReadDataNew {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println(ReadDataNew.fromExcel("Number", 8, 2));
		
		System.out.println(ReadDataNew.fromPropertyFile("password"));
		
		System.out.println(ReadDataNew.fromPropertyFile1("url"));
		
	}

}
