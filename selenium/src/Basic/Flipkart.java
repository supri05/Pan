package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement ele = driver.findElement(By.linkText("Create new account"));
ele.click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Female']/../input")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Male']/../input")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Custom']/../input")).click();
}
}
