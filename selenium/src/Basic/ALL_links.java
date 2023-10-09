package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALL_links {
public static void main(String[] args) {
WebDriver driver=	new ChromeDriver();
driver.get("https://www.amazon.in/");
        List<WebElement> alllinks = driver.findElements(By.tagName("a"));
        for (int i = 0; i < alllinks.size(); i++) {
		WebElement ele = alllinks.get(i);
			String text = ele.getText();
			System.out.println(text);
		
		}
        int count = alllinks.size();
        System.out.println(count);
}
}
