package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmiCalculator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://emicalculator.net/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();		
	List<WebElement> allButtons = driver.findElements(By.xpath("//*[@class='highcharts-point' and@fill='#B8204C']"));
	Actions a=new Actions(driver);
	for(int i=0;i<allButtons.size()-1;i++) {
		a.moveToElement(allButtons.get(i)).build().perform();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("(//*[contains(text(),'Year')]/..)[2]")).getText();
	System.out.println(text);
	}
}
}
