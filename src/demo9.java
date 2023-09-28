import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo9 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file= new FileInputStream("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Selenium.xlsx");
	
	///double value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
	
	//System.out.println(value);
	
	boolean value1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getBooleanCellValue();
	
	System.out.println(value1);
}
}
