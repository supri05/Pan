package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("Wipro"+Keys.ENTER);
Thread.sleep(2000);

List<WebElement> alll = driver.findElements(By.tagName("a"));
int count=alll.size();
System.out.println(count);
for (int i = 0; i < count; i++) {
	WebElement ele = alll.get(i);
	String e = ele.getAttribute("href");
	System.out.println(e);
}


}
}
