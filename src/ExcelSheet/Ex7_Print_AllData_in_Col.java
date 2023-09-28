package ExcelSheet;
//to print data in pewrticular column
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex7_Print_AllData_in_Col {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");
	
	Sheet sh= WorkbookFactory.create(file).getSheet("Sheet1");
	
	int lastRowIndex=sh.getLastRowNum();
	for(int i=0;i<=lastRowIndex;i++)
	{
		String value=sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value);
	}
	
}
}
