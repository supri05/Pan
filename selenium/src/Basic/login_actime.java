package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_actime {
public static void main(String[] args) throws IOException {
	FileInputStream f = new FileInputStream("./data/commondata.property");
	Properties ponj = new Properties();
	ponj.load(f);
	String url1 = ponj.getProperty("url");
     WebDriver	driver=new ChromeDriver();
     driver.get(url1);
     String un = ponj.getProperty("username");
     
    driver.findElement(By.id("username")).sendKeys(un);
    
    String pwd = ponj.getProperty("password");
    driver.findElement(By.name("pwd")).sendKeys(pwd);
     
	
}
}
