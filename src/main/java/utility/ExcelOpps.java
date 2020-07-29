package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOpps 
{
	FileInputStream fis;
	Workbook workbook;
	public ExcelOpps(String path) throws IOException
	{
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		
	}
	
	public String getData(String sheetName, int rowNum, int cellNum)
	{
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		return value;
	}

}
