package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Press_Information_B {
public static void main(String[] args) {
	ChromeOptions d = new ChromeOptions();
	d.addArguments("--disable-notifications");
WebDriver	driver =new ChromeDriver(d);
driver.manage().window().maximize();
driver.get("https://pib.gov.in/indexd.aspx");
driver.switchTo().alert().accept();
driver.findElement(By.linkText("Ministry of Education")).click();
driver.switchTo().alert().accept();
Set<String> hand = driver.getWindowHandles();
for (String string : hand) {
	driver.switchTo().window(string);
	
}
String ele = driver.getTitle();
System.out.println(ele);
}
}
