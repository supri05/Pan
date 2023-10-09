package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multiple_data {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/Testscript.xlsx");
	Workbook w = WorkbookFactory.create(fis);
	int count = w.getSheet("Sheet1").getLastRowNum();
	for (int i = 0; i <count; i++) {
		String s = w.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
		System.out.println(s+" ");
		String s1 = w.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
		System.out.print(s1);
	}
}
}
