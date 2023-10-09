package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flikcart1 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.name("q")).sendKeys("iphone 14 pro"+Keys.ENTER);
List<WebElement> allMobileName = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro')]"));
List<WebElement> allMobilePrice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro')]/../../div[2]/div[1]/div[1]/div[1]"));
for ( int i = 0; i < allMobileName.size(); i++) {
	WebElement mobName = allMobileName.get(i);
	WebElement ele = allMobilePrice.get(i);
	String price = ele.getText();
	String name= mobName.getText();
	System.out.println(name+" "+price);
}

}
}
