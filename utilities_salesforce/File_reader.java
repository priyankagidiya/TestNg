package utilities_salesforce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import configs.TestConstants;

public class File_reader {
	static Workbook book;
	static Sheet sheet;
	static FileInputStream file;
	public static String accountdatapath = "C:\\Users\\Abhis\\eclipse-workspace\\TestNG\\src\\test\\java\\pages\\Account.xlsx";
	
	public String ReadAccounts(String string ) {
		try {
		
		file = new FileInputStream(TestConstants.Accountpropertiespath);
		//sheet = book.getSheet(sheetname);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return book.getSheetName(1);
		
	 }
		public Object[][] gettestData(String sheetName){
		sheet = book.getSheet(sheetName);
		Object[][]data = new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
		for(int i = 0;i<sheet.getLastRowNum();i++) {
			for(int k =0; k<sheet.getRow(1).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				System.out.println(data[i][k]);
			}
		}
		return data;
	}
		
}
