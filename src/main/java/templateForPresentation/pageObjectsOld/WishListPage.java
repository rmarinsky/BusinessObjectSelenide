package templateForPresentation.pageObjectsOld;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class WishListPage {

    public WishListPage isLoaded(){
        $("#user_product_table_full").shouldBe(Condition.visible);
        return this;
    }

    public SelenideElement getProductById(Integer productId){
        return $(by("data-product-id",""+productId));
    }

    public void clickOnRemoveProductFromWishList(){
        $(by("href*","/account/wishlist/remove/")).click();
    }

}
