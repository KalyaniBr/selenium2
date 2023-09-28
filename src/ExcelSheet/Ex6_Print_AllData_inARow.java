package ExcelSheet;
 // to print all data in particular row (here data type of whole row should be same)
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException; ///for printing information present in Row (information should be same type ex.String)

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex6_Print_AllData_inARow {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");
	
	Sheet sh= WorkbookFactory.create(file).getSheet("Sheet2");
	int lastCellIndex=sh.getRow(0).getLastCellNum()-1;
	for(int i=0;i<=lastCellIndex;i++)
	{
		String value=sh.getRow(0).getCell(i).getStringCellValue();
		
		System.out.print(value+" ");
	}
	
	
}
}
