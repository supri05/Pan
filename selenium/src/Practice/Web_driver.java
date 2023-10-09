package Practice;
+
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_driver {
public static void main(String[] args) throws InterruptedException {
  WebDriver driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://www.facebook.com/");
  driver.manage().window().maximize();
  driver.findElement(By.id("email")).sendKeys("Hi");
  
   driver.findElement(By.id("email")).
    String ele=driver.findElement(By.id("email")).getLocation()
  System.out.println(ele);
  
}
}
