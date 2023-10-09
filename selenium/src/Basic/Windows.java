package Basic;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://secure.indeed.com/auth");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Thread.sleep(2000);
 Set<String> id = driver.getWindowHandles();
    for (String string : id) {
		driver.switchTo().window(string);
		System.out.println(driver.getTitle());
		driver.close();
	} 
}
}
