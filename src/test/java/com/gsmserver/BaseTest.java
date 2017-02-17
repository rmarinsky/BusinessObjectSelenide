package com.gsmserver;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.junit.TextReport;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Rule;

public abstract class BaseTest {

    final String TEST_VALUE = "testValue";
    final Integer TEST_PRODUCT_ID = 7462,
            DELIVERY_SERVICE_ID = 2045558838,
            PAYMENT_SERVICE_ID = 2032449552;

    @BeforeClass
    public static void beforeCLass(){
        ChromeDriverManager.getInstance().setup();
    }

    @Rule
    public TextReport textReport = new TextReport();

    @After
    public void after(){
        WebDriverRunner.clearBrowserCache();
    }

}
