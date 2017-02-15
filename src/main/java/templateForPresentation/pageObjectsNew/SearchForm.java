package templateForPresentation.pageObjectsNew;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchForm {

    public void searchFor(String query){
        $(By.name("q")).setValue(query).
                pressEnter();
    }

}
