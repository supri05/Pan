package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Empire {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/Hotel.html");
		WebElement ele = driver.findElement(By.id("empire"));
		Select s = new Select(ele);
		List<WebElement> ele1 = s.getOptions();
		for (int i = 0; i < ele1.size(); i++) {
			s.selectByIndex(i);
		}
		
		for (int i =ele1.size()-1 ; i >=0; i--) {
			s.deselectByIndex(i);
		}
	}
	
}
