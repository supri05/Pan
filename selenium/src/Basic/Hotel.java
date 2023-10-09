package Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/dell/Desktop/Hotel.html");
WebElement ele = driver.findElement(By.id("empire"));
Select s = new Select(ele);
Thread.sleep(2000);
s.selectByIndex(0);
Thread.sleep(2000);
s.selectByValue("4");
Thread.sleep(2000);
s.selectByVisibleText("Fish");
Thread.sleep(2000);
s.deselectByIndex(0);
Thread.sleep(2000);
s.deselectByValue("4");
Thread.sleep(2000);
s.deselectByVisibleText("Fish");
}
}
