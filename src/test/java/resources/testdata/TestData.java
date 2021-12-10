package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "buildYourComputerData")
    public static Object[][] objectTestData() {
        return new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Sales", "Swindon", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Sales jobs in Swindon"},
                {"Test Manger", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Test Manager jobs in Harrow on the Hill"},
                {"Test Engineer","Harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent Test Engineer jobs in Harrow on the Hill"},
                {"Test Manger","Harrow","up to 5 miles","40000","700000","Per annum","Permanent","Permanent Test Manager jobs in Harrow on the Hill"},
                {"Test Analyst","Harrow","up to 5 miles","30000","800000","Per annum","Permanent","Permanent Test Analyst jobs in Harrow on the Hill"},
                {"Test Technician","Harrow","up to 5 miles","20000","50000","Per annum","Permanent","Permanent Test Technician jobs in Harrow on the Hill"}

        };
    }

}
