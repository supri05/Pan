package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.support.ui.Select;

public class Hotel4 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/dell/Desktop/Hotel.html");
	WebElement ele = driver.findElement(By.id("empire"));
	Select s = new Select(ele);
	List<WebElement> ele1 = s.getOptions();
	/*for (int i = 0; i < ele1.size(); i++) {
		String text = ele1.get(i).getText();
		System.out.println(text);
		
	} */
	ArrayList <String>al = new ArrayList<>();
	for (int i = ele1.size()-1; i >=0; i--) {
		String text = ele1.get(i).getText();
		//System.out.println(text);
	al.add(text);
	} 
	/* for (int i = 0; i < s1.length; i++) {
		System.out.println(s1[i]);
	}*/
 
   Collections.sort(al);
   
   for (int i = 0; i < al.size(); i++) {
		System.out.println(al.get(i));
		}
   
   
	}
}
