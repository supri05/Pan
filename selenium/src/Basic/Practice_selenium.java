package Basic;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_selenium {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String day="29";
	String month="Mar";
	String year="2000";
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement  ele=driver.findElement(By.id("day"));
	Select s = new Select(ele);
	for (int i = 0; i < s.getOptions().size(); i++) {
		String text = s.getOptions().get(i).getText();
		
		if(text.equals(day)){
			s.selectByValue("29");
			break;
		}
		s.selectByIndex(i);
	}
	WebElement ele1=driver.findElement(By.id("month"));
	Select s2 = new Select(ele1);
	for (int i = 0; i < s2.getOptions().size(); i++) {
		String text = s2.getOptions().get(i).getText();
		s2.selectByIndex(i);
		if(text.equals(month))
		{
			s2.selectByValue("3");
			break;
		}
		
	}
	WebElement  ele4=driver.findElement(By.id("year"));
	Select s3 = new Select(ele4);
	for (int i = 0; i < s3.getOptions().size(); i++) {
		String text = s3.getOptions().get(i).getText();
		if(text.equals(year))
		{
			s3.selectByValue("2000");
			break;
		}
		s3.selectByIndex(i);	
	}
}
}
