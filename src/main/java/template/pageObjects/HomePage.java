package template.pageObjects;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public HomePage open(){
        Selenide.open("");
        return this;
    }

    public HomePage clickLoginLink(){
        $(".login").click();
        return this;
    }

    public HomePage searchFor(String query){
        $(By.name("q")).setValue(query);
        $(".search-input-submit").click();
        return this;
    }
}
