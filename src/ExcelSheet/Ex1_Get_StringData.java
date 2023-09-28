package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Workbook;
public class Ex1_Get_StringData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	// to pring string type info in cell
	
FileInputStream file =new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");

  String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

  System.out.println(value);

// Workbook book=WorkbookFactory.create(file);
 //Sheet sh=book.getSheet("Sheet1");
 // Row rw=sh.getRow(1);
//Cell cl=rw.getCell(0);
  //String value =cl.getStringCellValue(0);
  //System.out.println(Value);







}
}
