package application.page.base;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class XlsDataReader {
    HSSFWorkbook xlsWorkbook;
    HSSFSheet xlsSheet;

    public XlsDataReader(String xlFilePath){
        try{
            File src = new File(xlFilePath);
            FileInputStream fis =new FileInputStream(src);
            xlsWorkbook = new HSSFWorkbook(fis);
            xlsSheet = xlsWorkbook.getSheetAt(0);
            xlsWorkbook.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getData(int sheetnumber,int rownumber,int colnumber)	{
        xlsSheet = xlsWorkbook.getSheetAt(sheetnumber);
        String data = xlsSheet.getRow(rownumber).getCell(colnumber).getStringCellValue();
        return data;
    }
    public int getRowCount(String sheetName) {
        int index = xlsWorkbook.getSheetIndex(sheetName);
        if (index == -1)
            return 0;
        else {
            xlsSheet = xlsWorkbook.getSheetAt(index);
            int number = xlsSheet.getLastRowNum() + 1;
            return number;
        }
    }
}
