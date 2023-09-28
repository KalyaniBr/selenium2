package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoB {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file =new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");
 
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	
	int LastCellIndex=sh.getRow(0).getLastCellNum()-1;
	for(int i=0;i<=LastCellIndex;i++)
	{
		Cell CellInfo=sh.getRow(0).getCell(i);
		CellType s1=CellInfo.getCellType();
		if(s1==CellType.STRING)
		{
			String value=CellInfo.getStringCellValue();
			System.out.print(value+" ");
		}
		else if(s1==CellType.NUMERIC)
		{
			double value=CellInfo.getNumericCellValue();
			System.out.print(value+" ");
		}
		else if(s1==CellType.BOOLEAN)
		{
			boolean value=CellInfo.getBooleanCellValue();
			System.out.print(value+"");
		}
	}
	System.out.println();
		
	}
}

