package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
public String readDataFromPropertyFile(String key) throws IOException
{
 FileInputStream fis = new FileInputStream("./data/commondata.property");	
 Properties p = new Properties();
 p.load(fis);
  String s = p.getProperty(key);
 return s;
}
public void writeDataIntoExcel(String sheet,int rowno,int colno,String value) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./data/Testscript.xlsx");	
	 Workbook w = WorkbookFactory.create(fis);
	 w.getSheet(sheet).getRow(rowno).getCell(colno).setCellValue(value);
	 FileOutputStream fo = new FileOutputStream("./data/Testscript.xlsx");
	 w.write(fo);
	 
}
public String readDataFromExcelFile(String sheet,int rowno,int colno) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./data/Testscript.xlsx");	
	 Workbook w = WorkbookFactory.create(fis);
	String s = w.getSheet(sheet).getRow(rowno).getCell(colno).getStringCellValue();
	
	return s;
}


}
