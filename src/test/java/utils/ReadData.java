package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadData {

    public static String testDataPath = System.getProperty("user.dir") + "/src/test/java/testData/TestData.xlsx";
    static FileInputStream fileInputStream;

    static {
        try {
            fileInputStream = new FileInputStream(testDataPath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFWorkbook workbook;

    static {
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ReadData() throws Exception {
    }
    static XSSFSheet sheet  = workbook.getSheet( "Sheet1");
    public static String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public static String password = sheet.getRow(1).getCell(1).getStringCellValue();

}



