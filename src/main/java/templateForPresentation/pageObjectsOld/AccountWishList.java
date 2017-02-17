package templateForPresentation.pageObjectsOld;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class AccountWishList {

    public AccountWishList isLoaded(){
        Selenide.$("#user_product_table_full").shouldBe(Condition.visible);
        return this;
    }

    public SelenideElement getProductById(Integer productId){
        return Selenide.$(by("data-product-id",""+productId));
    }

    public void clickOnRemoveProductFromWishList(){
        Selenide.$(by("href*","/account/wishlist/remove/")).click();
    }

}
