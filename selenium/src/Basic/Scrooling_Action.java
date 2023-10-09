package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrooling_Action {
public static void main(String[] args) {
WebDriver	driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Actions a=new Actions(driver);
WebElement ele = driver.findElement(By.linkText("Sign Up"));
a.scrollToElement(ele).perform();
//a.scrollByAmount(0, 50).perform();
}
}
