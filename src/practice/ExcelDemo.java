package practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File f=new File("./data/Demodata.xlsx");
		Workbook w=WorkbookFactory.create(f);
	String s=w.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	String s1=w.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(s);
	System.out.println(s1);
	
	
	
	}

}


