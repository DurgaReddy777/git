import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public static void main(String[] args) throws IOException{
		File loc=new File("C:\\Users\\OMR\\eclipse-workspace\\MavenProject1\\excel\\AirLNewZealand.xlsx");
		FileInputStream fis=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s=w.getSheetAt(0);
		
		Row r=s.getRow(0);
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Cell c=r.getCell(i);
			System.out.println(c);
		}
		
		/*for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r=s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c=r.getCell(j);
				System.out.println(c);
			}
		}*/
		
		
		
		
	}
	
	

}
