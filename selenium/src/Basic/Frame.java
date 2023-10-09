package Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) {
WebDriver	driver=new ChromeDriver();
driver.get("file:///C:/Users/dell/Desktop/New%20folder/T1.html");
driver.manage().window().maximize();
driver.findElement(By.id("t1")).sendKeys("a");
driver.switchTo().frame(0);
driver.findElement(By.id("t2")).sendKeys("b");
driver.switchTo().parentFrame();
driver.findElement(By.id("t1")).sendKeys("c");
WebElement ele = driver.findElement(By.tagName("iframe"));
driver.switchTo().frame(ele);
driver.findElement(By.id("t2")).sendKeys("d");
driver.switchTo().parentFrame();
driver.findElement(By.id("t1")).sendKeys("e");
driver.switchTo().frame("f1");
driver.findElement(By.id("t2")).sendKeys("f");
driver.switchTo().defaultContent();
}
}
