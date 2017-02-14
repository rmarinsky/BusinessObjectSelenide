package utils;

import com.codeborne.selenide.Selenide;

public class JSExecutor {

    public void GETWithParam(final String requestUrl, final String param){
        Selenide.executeJavaScript(String.format("$.ajaxSetup({async: false}); " +
                "$.get('%s', %s)", requestUrl, param));
    }

}
