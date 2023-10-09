package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties pobj=new Properties();
	pobj.load(fis);
	String url = pobj.getProperty("url");
	String un = pobj.getProperty("username");
	String pwd = pobj.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);	
	}
}
