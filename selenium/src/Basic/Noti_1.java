package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

 public class Noti_1 {
 public static void main(String[] args) {
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");
     WebDriver driver = new ChromeDriver(opt);
	driver.get("https://pib.gov.in/indexd.aspx");
	driver.switchTo().alert().accept();
}
}
