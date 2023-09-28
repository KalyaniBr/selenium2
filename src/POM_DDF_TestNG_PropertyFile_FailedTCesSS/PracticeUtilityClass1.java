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

import com.google.j2objc.annotations.Property;

public class PracticeUtilityClass1 {


public static  String getTD(int rowIndex,int collIndex) throws EncryptedDocumentException, IOException	
{
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\eclipse-workspace\\Selenium2\\ExtenalExcel\\Selenium.xlsx");
    Sheet sh= WorkbookFactory.create(file).getSheet("DDF");
	String Value =sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
	return Value;
}

public static void CapterSS (WebDriver driver,int TCID) throws IOException
{
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\jayas\\eclipse-workspace\\Selenium2\\FailTCSS");
	
	FileHandler.copy(src, dest);
	
}
public static String readDataFromPF(String keys) throws IOException
{
	
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\eclipse-workspace\\Selenium2\\Property File.properties");
	
	Properties p=new Properties();
	p.load(file);
	
	String Value=p.getProperty(keys);
	
	return Value;
	
}


}