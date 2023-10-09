package Basic;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scanner_check_element {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/dell/Desktop/Hotel.html");
Scanner sc = new Scanner(System.in);
System.out.println("enter the item");
String item = sc.next();
item.equalsIgnoreCase(item);
WebElement ele = driver.findElement(By.id("empire"));
Select s = new Select(ele);
List<WebElement> ele1 = s.getOptions();
int count=0;
for (int i = 0; i < ele1.size(); i++) {
	String items = ele1.get(i).getText();
	
	if(item.equalsIgnoreCase(items)) {
		count++;
		break;
	}
	

	
}
if(count==1) {
	System.out.println("item found");
}
else
{
	System.out.println("not found");
}
}
}
