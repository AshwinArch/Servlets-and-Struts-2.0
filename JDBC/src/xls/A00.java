package xls;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Ashwin
 *
 */
public class A00
{
	public static void main(String[] args)throws Exception
	{
		Workbook wb = new HSSFWorkbook();
		FileOutputStream fileOut = new FileOutputStream("workbook1.xls");
		wb.write(fileOut);
		fileOut.close();
		 Workbook wb1 = new XSSFWorkbook();
		 FileOutputStream fileOut1 = new FileOutputStream("workbook1.xlsx");
		wb1.write(fileOut1);
		fileOut1.close();
	}
}
