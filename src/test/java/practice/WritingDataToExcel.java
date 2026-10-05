package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class WritingDataToExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\pp783\\OneDrive\\Desktop\\testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell=wb.getSheet("Animal").getRow(6).createCell(1);
		cell.setCellValue("cat");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\pp783\\OneDrive\\Desktop\\testData.xlsx");
		wb.write(fos);
		
		
		
		
		
	}

}
