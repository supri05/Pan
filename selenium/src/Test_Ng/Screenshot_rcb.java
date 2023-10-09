package Test_Ng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_rcb {
public static void main(String[] args) throws IOException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.royalchallengers.com/");
TakesScreenshot ts = (TakesScreenshot)driver;
File srcfile = ts.getScreenshotAs(OutputType.FILE);
File destfile = new File("./Screenshot1.png");
FileUtils.moveFile(srcfile, destfile);
}
}
