package templateForPresentation.pageObjectsOld;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public void open(){
        Selenide.open("");
    }

    public void clickLoginLink(){
        $(".login").click();
    }

    public void fillSearchField(String query){
        $(By.name("q")).setValue(query);
    }

    public void submitSearch(){
        $(".search-input-submit").click();
    }

}
