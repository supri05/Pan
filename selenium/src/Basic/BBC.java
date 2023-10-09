package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bbc.com/");
List<WebElement> ele = driver.findElements(By.xpath("//h2[text()='Latest Business News']/../ul/li/a/h3"));
	
	for (int i = 0; i <ele.size(); i++) {
	WebElement e=ele.get(i);
	String s= e.getText();
	System.out.println(s);
	}
}
}
