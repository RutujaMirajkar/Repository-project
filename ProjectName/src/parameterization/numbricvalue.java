package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class numbricvalue {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream File = new FileInputStream ("C:\\Users\\rutuja\\Desktop\\sheets\\Book2.xlsx");
	
	double data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
	System.out.println(data);
	
		
	}

}
