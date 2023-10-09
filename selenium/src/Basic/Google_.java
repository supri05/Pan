package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_ {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(2000);
 List<WebElement> alloption = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
 int count = alloption.size();
 for (int i = 0; i <count ; i++) {
	WebElement ele=alloption.get(i);
	String s=  ele.getText();
	System.out.println(s);
}
 alloption.get(count-1).click();

}
}
