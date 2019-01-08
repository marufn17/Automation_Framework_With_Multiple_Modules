package test.page.objects;

import application.page.base.ApplicationPageBase;
import application.page.base.XlsxDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.FooterPage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestFooterPage extends ApplicationPageBase {
    FooterPage footerPage;
    @BeforeMethod
    public void setUP(){
        footerPage = PageFactory.initElements(driver,FooterPage.class);
    }
    @Test
    public void isFooterLogoDisplayed(){
        boolean logo = footerPage.isFooterLogoDisplayd();
        Assert.assertEquals(logo,true);
    }
    @Test
    public void tabNameTest(){
        System.out.println(footerPage.webElementList());
    }
//    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("user.dir") + "/testData/FooterLinkName.xlsx");
        XlsxDataReader dr = new XlsxDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet1");
        System.out.println(data);
        return data;
    }
//    @Test(dataProvider ="DP")
//    public void footerElementCheck(String webelementName){
//        System.out.println(webelementName);
//        List<String> expected = new ArrayList<>();
//        expected.add(webelementName);
//        List<String> actual = footerPage.webElementList();
//        Assert.assertEquals(actual,expected);
//    }
    @Test
    public void test() throws Exception {
        footerPage.getTestData();
    }
}
