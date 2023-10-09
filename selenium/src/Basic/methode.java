package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methode {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().fullscreen();
driver.get("https://www.facebook.com/");
 //String s=driver.getTitle();
  String s=   driver.getCurrentUrl();
 System.out.println(s);
  String s1=driver.getWindowHandle();
  System.out.println(s1);
  driver.close();	
 //driver.manage().window().minimize();
}
}
