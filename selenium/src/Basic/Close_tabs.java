package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_tabs {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Set<String> hand = driver.getWindowHandles();
	for (String string : hand) {
		driver.switchTo().window(string);
		driver.close();
	}
}
}
