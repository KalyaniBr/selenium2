package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_How_To_handle_dropdown {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	
	//hit cancel login
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	//step1(find more button address)
	WebElement more=driver.findElement(By.xpath("//div[@class='exehdJ']"));
	
	//step2
	
	Actions act=new Actions(driver);
	
	//step3
	act.moveToElement(more).perform();
	//click to advertise
	
	driver.findElement(By.xpath("//div[text()='Advertise']")).click();
	
}
}
