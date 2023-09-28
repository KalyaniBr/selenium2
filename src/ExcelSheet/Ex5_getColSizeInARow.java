package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
     // to calculate No. of coloumns present in table
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 // to get num of coloumns in sheet
public class Ex5_getColSizeInARow {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Selenium.xlsx");
	
	int colSize=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	
	System.out.println(colSize);
	
	
	
	
	
}
}
