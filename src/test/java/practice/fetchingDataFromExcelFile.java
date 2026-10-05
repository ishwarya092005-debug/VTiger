package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchingDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\pp783\\OneDrive\\Desktop\\testData.xlsx");
		Workbook wb= WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("flowers");
		Row r=sh.getRow(3);
		Cell c=r.getCell(1);
		String value= c.getStringCellValue();
		System.out.println(value);
		
	}
}
