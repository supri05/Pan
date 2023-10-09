package Basic;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz1 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/78180/pak-vs-ind-super-fours-3rd-match-asia-cup-2023");
	 List<WebElement> ele = driver.findElements(By.xpath("(//span[contains(text(),'Innings'])[1]/../../div/div[1]/a"));
     List<WebElement> ele1 = driver.findElements(By.xpath("(//span[contains(text(),'Innings'])[1]/../../div/div[1]/a/../../div[3]"));
	for (int i = 0; i < ele.size(); i++) {
	String name=	  ele.get(i).getText();
	String run = ele1.get(i).getText();
	System.out.println(name+" has scored "+run);
	//System.out.println(name);
	}
}
}
