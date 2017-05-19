package dk;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestCase {
	public static void main(String[] args) throws  Exception {
		 File fi = new File("C:"+File.separator+"Users"+File.separator+"dk"+File.separator+"Desktop"+File.separator+"Testcase1.xlsx");
		FileInputStream fis=new FileInputStream(fi);
		Workbook workbook = WorkbookFactory.create(fis);
		int sheetCount = workbook.getNumberOfSheets();
		Sheet sheet =workbook.getSheetAt(sheetCount-1);
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		for(int r=0; r<rowCount;r++){
			Row row=sheet.getRow(r);
			int cellCount=row.getPhysicalNumberOfCells();
			
			for(int c=0;c<cellCount;c++){
				Cell cell=row.getCell(c);
				String cellTest=null;
				int cellType=cell.getCellType();
			switch(cellType){
			case Cell.CELL_TYPE_STRING:
				cellTest=cell.getStringCellValue();
				break;
			case Cell.CELL_TYPE_NUMERIC:
				cellTest=String.valueOf((int)cell.getNumericCellValue());
			}				
			System.out.println(cellTest);
			}
		}
	}
}
