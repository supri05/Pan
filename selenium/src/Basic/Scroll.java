package Basic;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com");
	JavascriptExecutor jse=(JavascriptExecutor) driver;	
	 int yaxis= driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getY();
	jse.executeScript("window.scrollBy(0,"+yaxis+ ")");
	}
}
