package ExcelData;

public class TestExcelDataConfig {

    public static void main(String[] args) {

        ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\soin1\\ExcelFiles\\TestData.xlsx");

        System.out.println(excel.getData(1, 0, 0));
    }
    }

