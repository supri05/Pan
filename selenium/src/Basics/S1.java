package Basics;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {
public static void main(String[] args) {
WebDriver driver=	new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.navigate().to("https://www.flipkart.com/");
driver.navigate().forward();
driver.navigate().back();
driver.navigate().refresh();
driver.manage().window().maximize();
driver.manage().window().minimize();
driver.manage().window().setSize(new Dimension(100,267));
driver.manage().window().setPosition(new Point(100,200));
      Dimension d=driver.manage().window().getSize();
   int x=d.getHeight();
    int y= d.getWidth();
  Point p=  driver.manage().window().getPosition();
 int a= p.getX();
int b= p.getY();
System.out.println(x);
System.out.println(y);
System.out.println(a);
System.out.println(b);

}
}
