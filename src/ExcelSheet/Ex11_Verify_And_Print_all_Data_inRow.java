package ExcelSheet;
 // to verify type of data and print data
// we can print different type of data present in same row
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex11_Verify_And_Print_all_Data_inRow {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file =new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");

	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	
   int LastcellIndex=sh.getRow(0).getLastCellNum()-1;	
	for(int i=0;i<=LastcellIndex;i++)  //for row
	{
		Cell cellInfo=sh.getRow(0).getCell(i);
			CellType s1=cellInfo.getCellType();
			
		if(s1==CellType.STRING)	
		{
			String value=cellInfo.getStringCellValue();
			System.out.print(value+" ");
		}
		else if	(s1==CellType.NUMERIC)
		{
			double value =cellInfo.getNumericCellValue();
			System.out.print(value+" ");		
		}
		else if(s1==CellType.BOOLEAN)
		{
			boolean value=cellInfo.getBooleanCellValue();
			System.out.print(value+" ");
		}
	}
	
	
}
}
