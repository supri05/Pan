package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshort {
public static void main(String[] args) throws InterruptedException, IOException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
TakesScreenshot ts=(TakesScreenshot)driver;
File filesrc = ts.getScreenshotAs(OutputType.FILE);
String path="./screenshot/s.png";
File filedest = new File(path);
FileUtils.copyFile(filesrc, filedest);
driver.quit();
}
}
