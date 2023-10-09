package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	Filelib f = new Filelib();
//	WebDriver    driver=new ChromeDriver();
//	String url = f.readDataFromPropertyFile("url");
//	driver.get(url);
//	String un= f.readDataFromPropertyFile("username");
//	driver.findElement(By.id("username")).sendKeys(un);
//	String pwd = f.readDataFromPropertyFile("password");
//	driver.findElement(By.name("pwd")).sendKeys(pwd);
	System.out.println(f.readDataFromExcelFile("Sheet2", 1, 3));
	f.writeDataIntoExcel("Sheet2", 1, 3,"loose" );
	
	System.out.println(f.readDataFromExcelFile("Sheet2", 1, 3));
//	f.readDataFromPropertyFile("username");
//	f.readDataFromPropertyFile("url");
//	f.readDataFromPropertyFile("username");
//	//f.readDataFromExcelFile();
}
}
