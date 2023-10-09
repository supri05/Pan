package Basic;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://secure.indeed.com/auth");
	driver.findElement(By.id("login-google-button")).click();
	Thread.sleep(2000);
	Set<String> hand = driver.getWindowHandles();
	
  
  for (String string : hand) {
	  
	 driver.switchTo().window(string);
	
}
  driver.findElement(By.id("identifierId")).sendKeys("dnana");
 }
}