package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex8_Print_All_Data_InaSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	// To print all Data in Sheet
	
	FileInputStream file=new FileInputStream("\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");

	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
	
	    int LastRowIndex= sh.getLastRowNum();
	
	    for(int i=0;i<=LastRowIndex;i++) //outer for loop-->for row
	    {
	    	int LastCellIndex=sh.getRow(i).getLastCellNum()-1;
	    	for(int j=0;j<=LastCellIndex;j++)  //inner for loop-->for colms
	    	{
	    		String value=sh.getRow(i).getCell(j).getStringCellValue();
	    		System.out.print(value+"  ");
	    	}
	    	System.out.println();
	    }
	
	//(Here getLastCellNum method returns Last cellNo to find last cell index need to  -1 from last cellNum)
	
	
	
	
}
}
