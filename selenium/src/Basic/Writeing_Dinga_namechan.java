package Basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writeing_Dinga_namechan {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f = new FileInputStream("./data/Testscript.xlsx");
	Workbook w = WorkbookFactory.create(f);
	w.getSheet("Sheet2").getRow(1).getCell(2).setCellValue("Dinga");
	FileOutputStream fo = new FileOutputStream("./data/Testscript.xlsx");
	w.write(fo);
	
}
}
