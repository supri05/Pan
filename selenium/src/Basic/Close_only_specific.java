package Basic;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_only_specific {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the element");
	String expected = s.next();
   WebDriver driver = new ChromeDriver();
	driver.get("https://secure.indeed.com/auth");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allWid = driver.getWindowHandles();
	String parent = driver.getWindowHandle();
	for (String wid : allWid) {
		String actual = driver.getTitle();
		if(actual.contains(expected))
		{
			driver.close();
		}
}
}
}
