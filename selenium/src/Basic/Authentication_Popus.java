package Basic;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popus {
public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
   
   }
}
