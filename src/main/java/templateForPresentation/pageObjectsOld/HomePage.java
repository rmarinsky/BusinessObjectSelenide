package templateForPresentation.pageObjectsOld;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public void open(){
        Selenide.open("");
    }

    public void clickLoginLink(){
        Selenide.$(".login").click();
    }

    public void fillSearchField(String query){
        Selenide.$(By.name("q")).setValue(query);
    }

    public void submitSearch(){
        Selenide.$(".search-input-submit").click();
    }

}
