package ExcelSheet;
 // To print data of diff datatype present in same coloumn
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex12_verify_and_PrintAllData_InCol {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file =new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");

	Sheet sh=WorkbookFactory.create(file).getSheet("sheet1");
	
	int LastRowIndex=sh.getLastRowNum();
	for(int i=0;i<=LastRowIndex;i++)
	{
		Cell cellInfo=sh.getRow(i).getCell(0);
		CellType s1=cellInfo.getCellType();
		
		if(s1==CellType.STRING)
		{
			String value=cellInfo.getStringCellValue();
			System.out.println(value);
		}
		else if(s1==CellType.NUMERIC)	
		{
			double value=cellInfo.getNumericCellValue();
			System.out.println(value);
		}
		else if(s1==CellType.BOOLEAN)
		{
			boolean value=cellInfo.getBooleanCellValue();
			System.out.println(value);
		}
		
		
	}
	
}
}
