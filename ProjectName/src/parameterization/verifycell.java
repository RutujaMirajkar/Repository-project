package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verifycell {
	public static void main(String[] args)  throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\rutuja\\Desktop\\sheets\\Book2.xlsx");
		 Cell Sheet1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0);
		 CellType Type = Sheet1.getCellType();
		// System.out.println(Sheet1);
		
		if (Type==CellType.STRING) {
			System.out.println(Sheet1.getStringCellValue());
		}
		else if(Type==CellType.NUMERIC) {
			System.out.println(Sheet1.getNumericCellValue());
		}
		
		else if (Type== CellType.BOOLEAN) {
			System.out.println(Sheet1.getBooleanCellValue());
		}
			else {
				System.out.println(false);
			}
			
			
		}
	}


