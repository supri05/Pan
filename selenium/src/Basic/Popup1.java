package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Popup1 {
    public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	String e = driver.switchTo().alert().getText();
	System.out.println(e);
	driver.switchTo().alert().accept();
	driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	WebElement ele6 = driver.findElement(By.id("demo"));
	String s1 = ele6.getText();
	System.out.println(s1);
	driver.findElement(By.linkText("Alert with Textbox")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("");
	
	driver.switchTo().alert().accept();
	WebElement el6 = driver.findElement(By.id("demo1"));
	String s4 = el6.getText();
	System.out.println(s4);
	
	
	
}
}
