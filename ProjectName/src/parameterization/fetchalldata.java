package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchalldata {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new 	FileInputStream ("C:\\Users\\rutuja\\Desktop\\sheets\\Book2.xlsx");
		 Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		 for (int i=0;i<=sheet1.getLastRowNum();i++) {
			
			 for(int j=0; j<sheet1.getRow(i).getLastCellNum()-1;j++) {
				
				 Cell cellinfo = sheet1.getRow(i).getCell(j);
				
				CellType ct = cellinfo.getCellType();
				
				if(ct==CellType.STRING) {
					System.out.println(cellinfo.getStringCellValue()+" ");
				}
				else if (ct==CellType.NUMERIC) {
					System.out.println(cellinfo.getNumericCellValue()+" ");
				}
				else if(ct==CellType.BOOLEAN) {
					System.out.println(cellinfo.getBooleanCellValue()+" ");
				}
				
				}
			 System.out.println();
				 }
		 }
	
		 
		 
	
	

	
}
