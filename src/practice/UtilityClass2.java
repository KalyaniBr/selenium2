package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass2 {

	public static String getTD(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\jayays\\\\Desktop\\Notes\\Selenium.xlsx ");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		
		String value=sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}
	
}
