package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	//to get data from excel sheet
	//need to pass 2 parameters 1.rowIndex 2.collIndex
	//Author name:kalyani
	public static String getTD(int rowIndex,int collIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Selenium.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		 String value = sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
		 return value;
		 
	}
	
	//This method is use to capture SS of Webpage
	//need two parameters 1.webdriver Object 2.TCID
	//Author name:ABC
	public static void captureSS(WebDriver driver ,int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest= new File("C:\\Users\\jayas\\eclipse-workspace\\Selenium2\\FailTCSS"+TCID+".jpg");
				//("C:\\Users\\jayas\\Desktop\\Notes\\Screenshots\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src,dest);
		
	}
	
	public static String readDataFromPF(String Key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\jayas\\eclipse-workspace\\Selenium2\\Property File.properties");
		
		Properties p=new Properties();
		p.load(file);
			
		String value=p.getProperty(Key);
			return value;	
	}
	
	
	
	
}
