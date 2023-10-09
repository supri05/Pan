package com.actitime.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demo.actitime.com/login.do");
LoginPage lg =new LoginPage(driver);
lg.login("admin1", "manager1");
Thread.sleep(2000);
lg.login("admin", "manager");
HomePage hg = new HomePage(driver);
hg.logout();
}
}
