package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	double s =(int) wb.getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(s);
	Sheet s1 = wb.getSheet("Sheet2");
	Row row = s1.getRow(1);
	Cell cell = row.getCell(2);
	String st = cell.
			getStringCellValue();
	System.out.println(st);
}
}
