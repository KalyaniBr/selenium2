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

public class PSH_UtilityClass {

	public static String readDataFromPropertyFile(String Key ) throws IOException
	{
		
		FileInputStream File=new FileInputStream("C:\\Users\\jayas\\eclipse-workspace\\Selenium2\\Property File.properties");
				
				Properties p=new Properties();
				
			p.load(File);
				
			String value=p.getProperty(Key);
		return value;
	
	}
	public static void CaptureSSOfFailTC(WebDriver driver,int TCID) throws IOException
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\jayas\\eclipse-workspace\\Selenium2\\FailTCSS");
		FileHandler.copy(src, dest);
	}
	
	public static String getTD(int rowIndex,int collIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream File=new FileInputStream("C:\\Users\\jayas\\eclipse-workspace\\Selenium2\\ExtenalExcel\\Selenium.xlsx");

		Sheet sh=WorkbookFactory.create(File).getSheet("DDF2");
		String Value=sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
		return Value;
	}
	
	
	
	
	
}
