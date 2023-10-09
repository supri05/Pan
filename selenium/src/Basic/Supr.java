package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Supr {
public static void main(String[] args) {
WebDriver driver=	new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login ']")).click();
WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
  String s=driver.getTitle();
  System.out.println(s);

}
}
