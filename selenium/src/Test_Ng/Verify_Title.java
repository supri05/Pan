package Test_Ng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Title {
	@Test
public void verifyTitle() {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.google.com");
String actualtital = driver.getTitle();
String exceptedtitle="Googly";
//when u are using if else it will do comparition
if(actualtital.equals(exceptedtitle))
{
	System.out.println("both the titles are same");
}
else
{
	System.out.println(" both the titles are not same");
}
driver.quit();
}
}
