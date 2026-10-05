package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is utility class which deals with excel file
 * @author ishu
 * @version 26-09-06
 */



public class ExcelUtility {
	/**
	 *  This is a generic method to fetch data from Excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	
	public String getDataFromExcel(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream(IPathUtility.excelPath);
		Workbook wb= WorkbookFactory.create(file);
		Cell cell = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value= df.formatCellValue(cell);
		return value;
		
		
	}
	
		/**
		 * this is the generic method to write data to excel file
		 * @param Sheetname
		 * @param roeIndex
		 * @param cellIndex
		 * @param value
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		

		
		public void WriteDataToExcel(String Sheetname,int rowIndex,int cellIndex, String value)throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell=wb.getSheet("Animal").getRow(6).createCell(1);
		cell.setCellValue("cat");
		FileOutputStream fos=new FileOutputStream(IPathUtility.excelPath);
		wb.write(fos);
		}
		
		
		
		
		
		
		
}
