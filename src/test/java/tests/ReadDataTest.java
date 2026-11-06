package tests;

import org.testng.annotations.Test;
import utils.ReadData;

public class ReadDataTest {
    @Test
    public void fileExists() {
        System.out.println("path = " + ReadData.testDataPath);
        System.out.println("exists = " + new java.io.File(ReadData.testDataPath).exists());
        System.out.println("Username: " + ReadData.username);
        System.out.println("Password: " + ReadData.password);
    }
}
