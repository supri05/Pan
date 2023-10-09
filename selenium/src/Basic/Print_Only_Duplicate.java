package Basic;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_Only_Duplicate
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("file:///C:/Users/dell/Desktop/Hotel.html");
	WebElement ele = driver.findElement(By.id("empire"));

	Select s=new Select(ele);
	TreeSet<String>t=new TreeSet<>();
	List<WebElement> allOptions = s.getOptions();
	for(int i=0;i<allOptions.size();i++) 
	{
		String text = allOptions.get(i).getText();
		t.add(text);
	}
	for ( String text : t)
	{
		System.out.println(text);
	}
	
	
	
}
}
