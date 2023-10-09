package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {
public static void main(String[] args) {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/droppable/");
driver.switchTo().frame(0);
WebElement ele = driver.findElement(By.id("draggable"));
WebElement ele1 = driver.findElement(By.id("droppable"));
driver.switchTo();
Actions a = new Actions(driver);
a.dragAndDrop(ele, ele1).perform();
}
}
