package Basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("Sheet1").getRow(4).getCell(2).setCellValue("Dinga");
FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
wb.write(fos);
}
}
