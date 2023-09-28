package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Property;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Practice {

	public static String getTD(int RowIndex ,int CollIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\\\\\\\Users\\\\\\\\jayas\\\\\\\\Desktop\\\\\\\\Notes\\\\\\\\Selenium.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		
		String value=sh.getRow(RowIndex).getCell(CollIndex).getStringCellValue();
		
		return value;
		
		
	}
	
	public static void CaptureSS(WebDriver driver,int TCID) throws IOException {
		
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("");
		
		FileHandler.copy(ss, dest);
		
		
	}
	
	public static String gteTDfromPF(String key) throws IOException {
		
		FileInputStream File=new FileInputStream("");
		
		Properties p=new Properties();
		p.load(File);
		
		String value=p.getProperty(key);
		
		return value;
		
		
	}
}




