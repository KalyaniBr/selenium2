package POM_DDF_TestNG_UtilityClass_BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	//this method is use to get test data from excel sheet
	//need to pass 2 parameters 1.rowIndex 2.collIndex
	//Author name:Kalyani
	
	public static String getTD(int rowIndex,int collIndex) throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Selenium.xlsx ");	
		
	Sheet sh= WorkbookFactory.create(file).getSheet("DDF");
		
	String value=sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
	return value;
	}
	
	//this method is use to copture SS of webpage
	//need to pass 2 parameters 1.webdriver Object 2.TCID
	//@Author name XYZ
	
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Screenshots\\\\.lyz.jpg");
		
			FileHandler.copy(src, dest);
	}

	
	
	
	
}
