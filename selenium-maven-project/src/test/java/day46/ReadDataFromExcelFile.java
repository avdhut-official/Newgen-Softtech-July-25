package day46;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelFile {
	
	public static void main(String[] args) throws IOException {
		
		String project_path=System.getProperty("user.dir");
		FileInputStream file_read=new FileInputStream(project_path+"\\Test.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file_read);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");	//workbook.getSheetAt(0);
		
		int no_of_rows=sheet.getLastRowNum();
		int no_of_cells=sheet.getRow(1).getLastCellNum();
		
		System.out.println(no_of_rows);
		System.out.println(no_of_cells);

		for(int i=0;i<=no_of_rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<no_of_cells;j++)
			{
				XSSFCell cell=row.getCell(j);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();		//new line
		}
		
		workbook.close();
		file_read.close();
		
	}

}




