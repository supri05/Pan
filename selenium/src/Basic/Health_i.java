package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Health_i {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();
	WebElement ele = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
	Select s = new Select(ele);
	s.selectByValue("10");
	WebElement ele1 = driver.findElement(By.className("ui-datepicker-year"));
	Select s2 = new Select(ele1);
	s2.selectByVisibleText("2000");
	driver.findElement(By.linkText("5")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
	
	
}
}
