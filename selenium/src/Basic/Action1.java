package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	WebElement ele = driver.findElement(By.xpath("//ul[@class='level-first false']/li"));
    Actions a = new Actions(driver);
}
}
