package Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Actitime {
public static void main(String[] args) throws AWTException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
WebElement ele = driver.findElement(By.linkText("actiTIME Inc."));

Actions a = new Actions(driver);
a.contextClick(ele).perform();

Robot r = new Robot();
//r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_W);

}
}
