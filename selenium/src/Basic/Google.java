package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=	new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("java");
Thread.sleep(2000);
 List<WebElement> allSuggs = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
 for (int i = 0; i < allSuggs.size(); i++) {
	WebElement ele = allSuggs.get(i);
    String text = ele.getText();
    System.out.println(text);
	
}
 int count=allSuggs.size();
 System.out.println(count);
}
}
