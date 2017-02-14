package com.gsmserver;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.junit.TextReport;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Rule;

public abstract class BaseTest {

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
