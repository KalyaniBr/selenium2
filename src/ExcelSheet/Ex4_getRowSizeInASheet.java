package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 //to calculate num of rows in sheet
public class Ex4_getRowSizeInASheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Selenium.xlsx");
	
	int rowSize=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
	System.out.println(rowSize);
	
	//(Here getLastRowNum method gives lastRowIndex so to find needs to add +1 to get RowSize)
	
}
}
