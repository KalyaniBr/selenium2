package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericDataASString {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	 FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");

	Sheet sh =WorkbookFactory.create(file).getSheet("Sheet3");
	 
	String value=sh.getRow(0).getCell(1).getStringCellValue();
	System.out.println(value);
	 
}
}
