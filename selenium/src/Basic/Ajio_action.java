package Basic;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajio_action {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='level-first false']/li"));
	    Actions a = new Actions(driver);
	    
	    for (WebElement webElement : ele) {
	    	Thread.sleep(2000);
			a.moveToElement(webElement).perform();
			a.contextClick().perform();
		}
	    for (int i = ele.size()-1; i >=0; i--) {
	    	Thread.sleep(2000);
	    	WebElement reverse = ele.get(i);
			a.moveToElement(reverse).perform();
		}
}
}
