package Basic;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_all_headings {
public static void main(String[] args) throws InterruptedException {
  WebDriver	driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://demo.actitime.com/login.do");
  driver.findElement(By.id("username")).sendKeys("admin");
  driver.findElement(By.name("pwd")).sendKeys("manager");
  driver.findElement(By.xpath("//div[text()='Login ']")).click();
  Thread.sleep(2000);
 driver.findElement(By.xpath("//div[@class='menu_icon']/../../../../.././div[4]/div/div/div")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("About your actiTIME")).click();
 Thread.sleep(2000);
 driver.findElement(By.linkText("Read Service Agreement")).click();
  Set<String> hand = driver.getWindowHandles();
  Thread.sleep(2000);
  for (String string : hand) {
	  driver.switchTo().window(string);
	  
	  //System.out.println(ele1);
  }
  Thread.sleep(2000);
  List<WebElement> ele1 = driver.findElements(By.tagName("h2"));
  int count = ele1.size();
  System.out.println(count-1);
  for (int i = 1; i < ele1.size(); i++) {
	  String ele3 = ele1.get(i).getText();
	System.out.println(ele3);
}
}
}

