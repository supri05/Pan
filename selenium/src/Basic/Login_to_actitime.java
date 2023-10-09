package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_to_actitime {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./data/commondata.property");
	Properties pobj = new Properties();
	pobj.load(fis);
	String url = pobj.getProperty("url");
    WebDriver	driver=new ChromeDriver();
    driver.get(url);
    String usn = pobj.getProperty("username");
    String pwd = pobj.getProperty("password");
    driver.findElement(By.id("username")).sendKeys(usn);
    
    driver.findElement(By.name("pwd")).sendKeys(pwd);
    driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
