package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class wholecolumn {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\rutuja\\Desktop\\sheets\\Book2.xlsx");
		 Sheet Sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");//getLastRowNum();
		
		for(int i=0;i<=1;i++) {
			for (int j=0;j<=Sheet1.getLastRowNum()-1;j++) {
				
		String data = Sheet1.getRow(i).getCell(j).getStringCellValue();	
				System.out.println(" "+data);
			}
		}
	}
		
}
		
	