package Webdriver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) throws InterruptedException  {

  WebDriver driver =new ChromeDriver();
     Alert a = driver.switchTo().alert();

     a.accept();
     a.dismiss();





}
}
