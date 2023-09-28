package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo3 {
public static void main(String[] args) throws IOException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(Src);
	
	File dest=new File("C:\\Users\\jayas\\Desktop\\Notes\\Screenshots\\.xyz.jpg");
	
	FileHandler.copy(Src, dest);
	
}
}
