package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_data_from_proprty_file {
public static void main(String[] args) throws IOException {
	FileInputStream fios = new FileInputStream("./data/commondata.property");
	Properties pobj = new Properties();
	pobj.load(fios);
	String url = pobj.getProperty("url");
	System.out.println(url);
	String us = pobj.getProperty("username");
	System.out.println(us);
	String pwd = pobj.getProperty("password");
	System.out.println(pwd);
}
}
