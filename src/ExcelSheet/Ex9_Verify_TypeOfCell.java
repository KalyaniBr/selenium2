package ExcelSheet;
 // to verify type of data in particular cell
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex9_Verify_TypeOfCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");

	CellType sh=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getCellType();
	
	//CellType s1=sh.getRow(0).getCell(2).getCellType();
	 System.out.println(sh);
	
	
	
}
}
