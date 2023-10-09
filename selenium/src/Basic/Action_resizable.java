package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_resizable {
public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/resizable/");
	driver.switchTo().frame(0);
	Actions a = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	a.clickAndHold(ele).moveByOffset(0, 50).perform();
	
	
}
}
