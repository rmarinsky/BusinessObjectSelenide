package templateForPresentation.componentObjectsNew;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class Search {

    public void searchFor(String query){
        Selenide.$(By.name("q")).setValue(query).
                pressEnter();
    }

    public ProductList openSearchResultFor(String query){
        Selenide.open("/search/?f=all&q="+query);
        return new ProductList();
    }

}
