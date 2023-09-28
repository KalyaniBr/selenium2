package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice {
public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	
	FileInputStream file=new FileInputStream("");
	
	    double o = WorkbookFactory.create(file).getSheet(null).getRow(0).getCell(0).getNumericCellValue();
	
	
	
	
	
	
	
	
	
	
	
}}
