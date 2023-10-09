package Basic;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Title {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://secure.indeed.com/auth");
	
	driver.findElement(By.id("login-google-button")).click();
	driver.manage().window().minimize();
	driver.findElement(By.id("apple-signin-button")).click();
	Set<String> ele = driver.getWindowHandles();
	for (String string : ele) {
		//System.out.println(string);
		driver.switchTo().window(string);
		
		System.out.println(driver.getTitle());
	}
}
}
