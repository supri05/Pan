package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
//sendKeys() it is used to enter a value in textbox
driver.findElement(By.id("username")).sendKeys("Virat123");
//clear() is used to clear the textbox
driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
//click() is used to click on any elements(checkbox, radio button, links)
driver.findElement(By.name("remember")).click();
WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
//getAttribute() is used to get the attribute value of an element 
//It is a parameterized method which will String attribute name has parameter, bcoz for one element 
//we will have multiple attribute
String url = link.getAttribute("href");
System.out.println("Attribute value of href: " + url);

driver.findElement(By.xpath("//div[text()='Login ']")).click();
Thread.sleep(3000);
WebElement errormsg = driver.findElement(By.className("errormsg"));
//getCssValue() to get css value(colour, font size, font family) of an element
//It is a parameterized method which will String property name has parameter, bcoz for one element 
//we will have multiple properties
String color = errormsg.getCssValue("color");
System.out.println("Color of the error msg: " + color);
//getText() is used to get the tagText of an element
String text = errormsg.getText();
System.out.println("Error message is: " + text);
//getTagName() is used to get the tagName of an element
String tag = errormsg.getTagName();
System.out.println("Tagname of error message is: " + tag);
WebElement pwdTbx = driver.findElement(By.name("pwd"));
//getLocation()is used to get the location of an element
//to get the x axis of an element we use getX() of Point class
//to get the y axis of an element we use getY() of Point class
Point p = pwdTbx.getLocation();
int xAxis = p.getX();
int yAxis = p.getY();
System.out.println("X axis of password textbox: " + xAxis);
System.out.println("Y axis of password textbox: " + yAxis);
//getSize() is used to get the size of an element
//to get the height of an element we use getHeight() which is present in Dimension class
//to get the width of an element we use getWidth() which is present in Dimension class
Dimension d = pwdTbx.getSize();
int height = d.getHeight();
int width = d.getWidth();
System.out.println("Height of password textbox: " + height);
System.out.println("Width of password textbox: " + width);
//getRect() is a combination of getSize() and getLocation() the return type is Rectangle
//isDisplayed() is used to check whether an element is displayed or not
boolean res = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]")).isDisplayed();
if (res) {
System.out.println("Element is displayed");
} else {
System.out.println("Element is not displayed");
}
//isEnabled() is used to check whether an element is enabled or not
boolean res1 = driver.findElement(By.partialLinkText("Login")).isEnabled();
if (res1) {
System.out.println("Element is enabled");
} else {
System.out.println("Element is disabled");
}
//driver.findElement(By.cssSelector("input[type='checkbox']")).click();
//isSelected() is used to check whether an element is selected or not
boolean res2 = driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
if (res2) {
System.out.println("Checkbox is selected");
} else {
System.out.println("Checkbox is not selected");
}
}
}