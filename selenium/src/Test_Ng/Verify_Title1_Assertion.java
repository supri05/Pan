package Test_Ng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verify_Title1_Assertion {
	@Test
	public void verifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
	String actualtital = driver.getTitle();
	String exceptedtitle="Googly";
	//it is doing only comparsion of two titles that's why we will not use if else because it
	//will not fail the test case 
	Assert.assertEquals(actualtital, exceptedtitle);
    SoftAssert s = new SoftAssert();
    s.assertEquals(actualtital, exceptedtitle);
	driver.quit();
	s.assertAll();
	}
}