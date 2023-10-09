package Basic;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.linkText("Create new account")).click();
	WebElement ele = driver.findElement(By.id("day"));
     Select s= 	new Select(ele);
     s.selectByIndex(4);
     WebElement ele1 = driver.findElement(By.id("month"));
     Select s1 = new Select(ele1);
     s1.selectByValue("11");
     WebElement ele3 = driver.findElement(By.id("year"));
	Select s2 = new Select(ele3);
	s2.selectByVisibleText("2000");
	
}
}
