package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='dragableBox' and not(contains(@id,'DHTML'))]"));
List<WebElement> ele2 = driver.findElements(By.className("dragableBoxRight"));
Actions a = new Actions(driver);
for (int i = 0; i < ele1.size(); i++) {
	WebElement first = ele1.get(i);
	WebElement sec = ele2.get(i);
	a.dragAndDrop(first,sec).perform();
}
}
}
