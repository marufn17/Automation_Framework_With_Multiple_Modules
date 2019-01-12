package ExcelData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class CreateExcelFile {
    public static void main(String[] args) {
        try{

            XSSFWorkbook workbook = new XSSFWorkbook();
            FileOutputStream out = new FileOutputStream("C:\\Users\\soin1\\ExcelFiles\\CreateExcelFile.xlsx");
            XSSFSheet Spreadsheet = workbook.createSheet("Safwan");
            workbook.write(out);
            out.close();

        }catch (Exception e){

            System.out.println(e);
        }
        System.out.println("Excel File Created");
    }
}
