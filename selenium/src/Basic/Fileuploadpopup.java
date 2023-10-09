package Basic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/dell/Desktop/New%20folder/Resume.html");
	Thread.sleep(2000);
	WebElement file = driver.findElement(By.id("resume"));
	Thread.sleep(2000);
	file.sendKeys("C:\\Users\\dell\\Desktop\\New Microsoft Word Document.docx");
}
}
