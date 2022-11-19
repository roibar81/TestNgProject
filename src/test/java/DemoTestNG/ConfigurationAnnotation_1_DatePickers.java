package DemoTestNG;

import org.testng.annotations.*;

public class ConfigurationAnnotation_1_DatePickers {
    @Test(groups = "smoke")
    public void test1_BootstrapDatePickers(){
        System.out.println("     (5) Test Method 1: Bootstrap Date Pickers");
    }

    @Test(groups = {"regression", "e2e"})
    public void test2_JQueryDatePickers(){
        System.out.println("     (5) Test method 2: JQuery Date Pickers");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("    (4) Execute Before Each Test Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("    (4) Execute After Each Test Method\n");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("   (3) Execute Before Class: Date Pickers");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("   (3) Execute After Class: Date Pickers\n");
    }
}
