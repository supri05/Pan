package Basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_data_into_excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/Testscript.xlsx");
	Workbook w = WorkbookFactory.create(fis);
	 w.getSheet("Sheet2").getRow(1).getCell(5).setCellValue("pass");
	FileOutputStream fos = new FileOutputStream("./data/Testscript.xlsx");
    w.write(fos);
}
}
