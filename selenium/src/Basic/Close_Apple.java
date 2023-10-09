package Basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Apple {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com/auth");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	 Set<String> hand = driver.getWindowHandles();
	 
//	for (String string : hand) {
//		driver.switchTo().window(string);
//		String e = driver.getTitle();
//		
//		if(e.contains("Apple"))
//		{
//			driver.close();
//		}
//	}
	Iterator<String> i = hand.iterator();
	while (i.hasNext()) {
		String string = (String) i.next();
		driver.switchTo().window(string);
		String e = driver.getTitle();
		if(e.contains("Apple")||e.contains("Google"))
		{
			driver.close();
		}
		
	}
}
}
