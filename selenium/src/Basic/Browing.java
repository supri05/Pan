package Basic;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browing {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://secure.indeed.com/auth");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allWid = driver.getWindowHandles();
	String parent = driver.getWindowHandle();
	for (String wid : allWid) {
		driver.switchTo().window(wid);
		if(parent.equals(wid))
		{
			driver.close();
		}
		else {
			
		}
	}
}
}
