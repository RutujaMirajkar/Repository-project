package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class wholerow {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\rutuja\\Desktop\\sheets\\Book2.xlsx");
		 Sheet Sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");//getLastRowNum();
		
		for (int i=5;i<=Sheet1.getLastRowNum();i++){
			for(int j=0; j<= Sheet1.getRow(i).getLastCellNum();j++) {
				
			String data = Sheet1.getRow(i).getCell(j).getStringCellValue();
			
			System.out.println(data);
			}
		  
		
		}
	}

}
