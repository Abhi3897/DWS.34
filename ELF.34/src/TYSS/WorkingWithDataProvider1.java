package TYSS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithDataProvider1 {
	public  static Object[][] getData(String sheetname) throws EncryptedDocumentException, IOException{
  File file=new File("./TestData/TestData.xlsx");
  FileInputStream fis=new FileInputStream(file);
  Workbook workbook=WorkbookFactory.create(fis);
   Sheet sheet=workbook.getSheet(sheetname);
	
	int rowcount=sheet.getPhysicalNumberOfRows();
	int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
	
	Object[][] data=new Object[rowcount-1][colcount];
	for(int i=1;i<rowcount;i++) {
		for(int j=0;j<colcount;j++) {
			data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			
		}
	}
	return data;
}
}



