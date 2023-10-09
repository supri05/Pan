package Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_class {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	Runtime.getRuntime().exec("Notepad");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CAPS_LOCK);
	r.keyPress(KeyEvent.VK_R);
	r.keyPress(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_B);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_ALT);
}
}
