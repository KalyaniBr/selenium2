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

public class UtilityClass2 {

	public static String getTD(int rowIndex,int collIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");
		
		 Sheet sh=WorkbookFactory.create(file).getSheet("DDF");		
		
		String value=sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
		return value;
	}
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Screenshots\\\\TestCaseID\"+TCID+\".jpg");
		FileHandler.copy(src,dest);
	}
	
	public static String readDaTaFromPF(String Key) throws IOException
	
	{
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\jayas\\\\eclipse-workspace\\\\Selenium2\\\\Property File.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		String value=p.getProperty(Key);
				return value;
	}
	
	
	
	
}
