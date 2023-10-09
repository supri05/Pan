package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/78187/ind-vs-sl-super-fours-4th-match-asia-cup-2023");
	 List<WebElement> allPlayers = driver.findElements(By.xpath("(//span[contains(text(),'Innings')])[1]/../../div/div[1]/a"));
	 List<WebElement> allScores = driver.findElements(By.xpath("(//span[contains(text(),'Innings')])[1]/../../div/div[1]/a/../../div[3]"));
	 for(int i=0;i<allPlayers.size();i++) {
		 String player = allPlayers.get(i).getText();
		 String runs = allScores.get(i).getText();
		 System.out.println("Runs scored by "+player+" is: "+runs);
	 }
}
}
