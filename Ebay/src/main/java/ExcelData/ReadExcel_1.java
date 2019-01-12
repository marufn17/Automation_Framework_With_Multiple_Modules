package ExcelData;

import base.CommonAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel_1 extends CommonAPI {

    public static void main(String[] args) throws IOException {

        File src = new File("C:\\Users\\soin1\\ExcelFiles\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet1  = wb.getSheetAt(0);

        int rowcount = sheet1.getLastRowNum();

        System.out.print("Total rows is "+rowcount+1);

       for (int i = 0; i<rowcount; i++)

       {
           String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();

            System.out.println(" Data from Row " +i+data0);
        }
         wb.close();
    }
}