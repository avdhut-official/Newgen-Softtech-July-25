package day46;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String project_path=System.getProperty("user.dir");
		FileOutputStream file_write=new FileOutputStream(project_path+"\\Test1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Test Data");
		
		XSSFRow row_1=sheet.createRow(0);
			row_1.createCell(0).setCellValue("Java");
			row_1.createCell(1).setCellValue(30);
			row_1.createCell(2).setCellValue("Automation");
		
		XSSFRow row_2=sheet.createRow(1);
			row_2.createCell(0).setCellValue("Python");
			row_2.createCell(1).setCellValue(25);
			row_2.createCell(2).setCellValue("Automation");
		
		XSSFRow row_3=sheet.createRow(2);
			row_3.createCell(0).setCellValue(".net");
			row_3.createCell(1).setCellValue(20);
			row_3.createCell(2).setCellValue("Automation");
			
		workbook.write(file_write);
		workbook.close();
		file_write.close();
		
		System.out.println("File is Created");
	}

}
