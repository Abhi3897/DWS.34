package AdvanceSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithDatadriven {
	static File file=new File("./TestData/TestData.xlsx");
	static FileInputStream fis;
	static Workbook workbook;
	//static Sheet sheet;

public static String readStringValue(String Sheetname,int Rownum,int Colnum) throws EncryptedDocumentException, IOException {
	fis=new FileInputStream(file);
	workbook=WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet(Sheetname);
	return sheet.getRow(Rownum).getCell(Colnum).getStringCellValue();
	
}
} 
