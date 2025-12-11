package day47;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataUtility {

	public static FileInputStream file_read;
	public static FileOutputStream file_write;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;

	public static int getRowCount(String xlfile, String xlsheet) throws IOException {
		file_read = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(file_read);
		sheet = workbook.getSheet(xlsheet);
		int rowCount = sheet.getLastRowNum();
		workbook.close();
		file_read.close();
		return rowCount;
	}

	public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException {
		file_read = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(file_read);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);

		int CellCount = row.getLastCellNum();
		workbook.close();
		file_read.close();
		return CellCount;
	}

	public static String getCellData(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
		file_read = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(file_read);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);

		cell = row.getCell(colnum);

		String data;
		try {
			// data=cell.toString();
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);
		} catch (Exception e) {
			data = "";
		}
		workbook.close();
		file_read.close();

		return data;

	}

	public static void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data)
			throws IOException

	{
		file_read = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(file_read);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);

		cell = row.createCell(colnum);
		cell.setCellValue(data);
		file_write = new FileOutputStream(xlfile);
		workbook.write(file_write);
		workbook.close();
		file_read.close();
		file_write.close();
	}

	public static void fillGreenColor(String xlfile, String xlsheet, int rownum, int colnum)
			throws IOException
	{
		file_read = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(file_read);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);

		style = workbook.createCellStyle();

		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		cell.setCellStyle(style);
		file_write = new FileOutputStream(xlfile);
		workbook.write(file_write);
		workbook.close();
		file_read.close();
		file_write.close();

	}

	public static void fillRedColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
	{
		file_read = new FileInputStream(xlfile);
		workbook = new XSSFWorkbook(file_read);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);

		style = workbook.createCellStyle();

		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		cell.setCellStyle(style);
		file_write = new FileOutputStream(xlfile);
		workbook.write(file_write);
		workbook.close();
		file_read.close();
		file_write.close();

	}
}