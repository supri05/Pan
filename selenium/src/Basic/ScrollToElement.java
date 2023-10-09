package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	int yAxis = driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getY();
	JavascriptExecutor jse=(JavascriptExecutor ) driver;
	jse.executeScript("window.scrollBy(0,"+yAxis+")");
}
}
